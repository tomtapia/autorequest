package com.falabella.cdci.projects.motorda.servicios.commons;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class ReflectionHelper {

	public static void setValue(Object instance, String property, String[] value)
			throws IllegalArgumentException, IllegalAccessException, ParseException, DatatypeConfigurationException {
		Field campo = searchField(instance, property);
		if (campo == null) {
			// System.out.println("Campo no encontrado: " + property);
		} else {
			campo.setAccessible(true);
			if (campo.getType() == List.class) {
				ParameterizedType campoListType = (ParameterizedType) campo.getGenericType();
				Class<?> campoListTypeClass = (Class<?>) campoListType.getActualTypeArguments()[0];
				if (campoListTypeClass == Long.class) {
					List<Long> lista = (List<Long>) campo.get(instance);
					if (lista == null)
						lista = new ArrayList<Long>();
					for (String val : value)
						lista.add(Long.parseLong(val));
					campo.set(instance, lista);
				} else if (campoListTypeClass == Double.class) {
					List<Double> lista = (List<Double>) campo.get(instance);
					if (lista == null)
						lista = new ArrayList<Double>();
					for (String val : value)
						lista.add(Double.parseDouble(val));
					campo.set(instance, lista);
				}
			} else if (campo.getType() == double.class) {
				campo.set(instance, Double.parseDouble(value[0]));
			} else if (campo.getType() == long.class) {
				campo.set(instance, Long.parseLong(value[0]));
			} else if (campo.getType() == int.class) {
				campo.set(instance, Integer.parseInt(value[0]));
			} else if (campo.getType() == BigDecimal.class) {
				campo.set(instance, new BigDecimal(value[0]));
			} else if (campo.getType() == XMLGregorianCalendar.class) {
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				GregorianCalendar cal = (GregorianCalendar) Calendar.getInstance();
				cal.setTime(sdf.parse(value[0]));
				campo.set(instance, DatatypeFactory.newInstance().newXMLGregorianCalendar(cal));
			} else {
				campo.set(instance, value[0]);
			}
			campo.setAccessible(false);
		}
	}

	public static void setDefaultValues(Object instance)
			throws NumberFormatException, IllegalArgumentException, IllegalAccessException {
		Field[] campos = instance.getClass().getDeclaredFields();
		for (Field campo : campos) {
			campo.setAccessible(true);
			if (campo.get(instance) != null)
				continue;
			else {
				XmlElement elemento = campo.getAnnotation(XmlElement.class);
				String defaultValue = "\u0000";
				if(elemento != null)
					defaultValue = elemento.defaultValue();
				if ("\u0000".equalsIgnoreCase(defaultValue))
					defaultValue = "";
				if (campo.getType() == double.class) {
					campo.set(instance, Double.parseDouble(defaultValue));
				} else if (campo.getType() == long.class) {
					campo.set(instance, Long.parseLong(defaultValue));
				} else if (campo.getType() == String.class) {
					campo.set(instance, defaultValue);
				} else if (campo.getType() == List.class) {
					ParameterizedType campoListType = (ParameterizedType) campo.getGenericType();
					Class<?> campoListTypeClass = (Class<?>) campoListType.getActualTypeArguments()[0];
					Size sizeAnnotation = campo.getAnnotation(Size.class);
					int maxValue = sizeAnnotation.max();
					if (sizeAnnotation.max() > 23)
						maxValue = 24;
					if (campoListTypeClass == Long.class) {
						List<Long> lista = (List<Long>) campo.get(instance);
						if (lista == null)
							lista = new ArrayList<Long>();
						for (int i = 0; i < maxValue; i++)
							lista.add(Long.parseLong("-99"));
						campo.set(instance, lista);
					} else if (campoListTypeClass == Double.class) {
						List<Double> lista = (List<Double>) campo.get(instance);
						if (lista == null)
							lista = new ArrayList<Double>();
						for (int i = 0; i < maxValue; i++)
							lista.add(Double.parseDouble("-99.0"));
						campo.set(instance, lista);
					} else if (campoListTypeClass == String.class) {
						List<String> lista = (List<String>) campo.get(instance);
						if (lista == null)
							lista = new ArrayList<String>();
						for (int i = 0; i < maxValue; i++)
							lista.add("|");
						campo.set(instance, lista);
					}
				}
			}
			campo.setAccessible(false);
		}
	}

	private static Field searchField(Object instance, String name) {
		Field[] campos = instance.getClass().getDeclaredFields();
		for (int i = 0; i < campos.length; i++)
			if (campos[i].getName().toLowerCase().equals(name.toLowerCase()))
				return campos[i];
		return null;
	}

}
