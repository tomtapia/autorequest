package com.falabella.cdci.projects.motorda.servicios.builder;

import java.io.StringWriter;
import java.text.ParseException;
import java.util.Map;

import javax.xml.bind.JAXBException;
import javax.xml.datatype.DatatypeConfigurationException;

public abstract class AbstractBuilder {

	protected Map<String, String[]> values;
	protected StringWriter validRequest;

	public AbstractBuilder(Map<String, String[]> values) {
		this.values = values;
		this.validRequest = new StringWriter();
	}

	protected abstract void generateRequest() throws IllegalArgumentException, IllegalAccessException, JAXBException,
			ParseException, DatatypeConfigurationException;

}
