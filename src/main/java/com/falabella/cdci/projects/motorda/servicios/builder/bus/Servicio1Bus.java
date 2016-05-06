package com.falabella.cdci.projects.motorda.servicios.builder.bus;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.datatype.DatatypeConfigurationException;

import org.eclipse.persistence.jaxb.BeanValidationMode;
import org.eclipse.persistence.jaxb.JAXBContextProperties;

import com.falabella.cdci.projects.motorda.servicios.builder.AbstractBuilder;
import com.falabella.cdci.projects.motorda.servicios.commons.ReflectionHelper;

import s1bus.BExtLlamada1;
import s1bus.EntradaLlamada1;
import s1bus.EvaluacionsinBuro;
import s1bus.ObjectFactory;
import s1bus.Ocontrol;

public class Servicio1Bus extends AbstractBuilder {

	public Servicio1Bus(Map<String, String[]> busValues) throws IllegalArgumentException, IllegalAccessException,
			JAXBException, ParseException, DatatypeConfigurationException {
		super(busValues);
		generateRequest();
	}

	@Override
	protected void generateRequest() throws IllegalArgumentException, IllegalAccessException, JAXBException,
			ParseException, DatatypeConfigurationException {
		ObjectFactory factory = new ObjectFactory();
		Ocontrol ocontrol = factory.createOcontrol();
		EntradaLlamada1 entradaLlamada1 = factory.createEntradaLlamada1();
		for (String key : values.keySet())
			ReflectionHelper.setValue(entradaLlamada1, key, values.get(key));
		ReflectionHelper.setDefaultValues(entradaLlamada1);
		BExtLlamada1 bExtLlamada1 = factory.createBExtLlamada1();
		bExtLlamada1.setOCONTROL(ocontrol);
		bExtLlamada1.setEntrada1(entradaLlamada1);
		EvaluacionsinBuro evaluacionsinBuro = factory.createEvaluacionsinBuro();
		evaluacionsinBuro.setArg0(bExtLlamada1);

		Map<String, BeanValidationMode> props = new HashMap<>();
		props.put(JAXBContextProperties.BEAN_VALIDATION_MODE, BeanValidationMode.AUTO);
		JAXBContext context = JAXBContext.newInstance("s1bus", this.getClass().getClassLoader(), props);
		JAXBElement<EvaluacionsinBuro> element = factory.createPersonalRiesgoprimarioEvaluarRequest(evaluacionsinBuro);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
		marshaller.marshal(element, validRequest);
	}

	@Override
	public String toString() {
		return validRequest.toString();
	}
}
