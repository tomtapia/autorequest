package com.falabella.cdci.projects.motorda;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

import com.falabella.cdci.projects.motorda.servicios.builder.bus.Servicio1Bus;
import com.falabella.cdci.projects.motorda.servicios.builder.motor.Servicio1Motor;
import com.falabella.cdci.projects.motorda.servicios.commons.InputFileReader;

public class App {

	public static void main(String[] args) {

		URL url = App.class.getResource("/inputServicio1.csv");
		InputFileReader ifr = null;
		Servicio1Bus servicio1Bus = null;
		Servicio1Motor servicio1Motor = null;

		try {
			ifr = new InputFileReader(url.toURI());
		} catch (FileNotFoundException | URISyntaxException e) {
			System.err.println("Hubo un problema leyendo el archivo, " + e.getLocalizedMessage());
			e.printStackTrace();
			System.exit(0);
		}

		try {
			servicio1Bus = new Servicio1Bus(ifr.getBusValues());
		} catch (IllegalArgumentException | IllegalAccessException | JAXBException | ParseException
				| DatatypeConfigurationException e) {
			System.err.println("Hubo un problema generando el request, " + e.getLocalizedMessage());
			e.printStackTrace();
			System.exit(0);
		}

		// System.out.println(servicio1Bus);

		try {
			servicio1Motor = new Servicio1Motor(ifr.getMotorValues());
		} catch (IllegalArgumentException | IllegalAccessException | JAXBException | ParseException
				| DatatypeConfigurationException e) {
			System.err.println("Hubo un problema generando el request, " + e.getLocalizedMessage());
			e.printStackTrace();
			System.exit(0);
		}

		System.out.println(servicio1Motor);
	}

}
