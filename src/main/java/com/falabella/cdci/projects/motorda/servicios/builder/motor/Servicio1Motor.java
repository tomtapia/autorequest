package com.falabella.cdci.projects.motorda.servicios.builder.motor;

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

import s1motor.AuBI;
import s1motor.BInt;
import s1motor.EvaluacionsinBuro;
import s1motor.InDCE;
import s1motor.InDP;
import s1motor.InDSC;
import s1motor.InDSF;
import s1motor.InDSTE;
import s1motor.InDSTUD;
import s1motor.ObjectFactory;
import s1motor.Ocontrol;
import s1motor.OutBI;

public class Servicio1Motor extends AbstractBuilder {

	public Servicio1Motor(Map<String, String[]> values) throws IllegalArgumentException, IllegalAccessException,
			JAXBException, ParseException, DatatypeConfigurationException {
		super(values);
		generateRequest();
	}

	@Override
	protected void generateRequest() throws IllegalArgumentException, IllegalAccessException, JAXBException,
			ParseException, DatatypeConfigurationException {
		ObjectFactory factory = new ObjectFactory();
		AuBI aubi = factory.createAuBI();
		InDCE indce = factory.createInDCE();
		InDP indp = factory.createInDP();
		InDSC indsc = factory.createInDSC();
		InDSF indsf = factory.createInDSF();
		InDSTE indste = factory.createInDSTE();
		InDSTUD indstud = factory.createInDSTUD();
		OutBI outbi = factory.createOutBI();
		Ocontrol ocontrol = factory.createOcontrol();

		for (String key : values.keySet()) {
			ReflectionHelper.setValue(aubi, key, values.get(key));
			ReflectionHelper.setValue(indce, key, values.get(key));
			ReflectionHelper.setValue(indp, key, values.get(key));
			ReflectionHelper.setValue(indsc, key, values.get(key));
			ReflectionHelper.setValue(indsf, key, values.get(key));
			ReflectionHelper.setValue(indste, key, values.get(key));
			ReflectionHelper.setValue(indstud, key, values.get(key));
			ReflectionHelper.setValue(outbi, key, values.get(key));
		}

		ReflectionHelper.setDefaultValues(aubi);
		ReflectionHelper.setDefaultValues(indce);
		ReflectionHelper.setDefaultValues(indp);
		ReflectionHelper.setDefaultValues(indsc);
		ReflectionHelper.setDefaultValues(indsf);
		ReflectionHelper.setDefaultValues(indste);
		ReflectionHelper.setDefaultValues(indstud);
		ReflectionHelper.setDefaultValues(outbi);

		BInt bint = factory.createBInt();
		bint.setAUBI(aubi);
		bint.setINDCE(indce);
		bint.setINDP(indp);
		bint.setINDSC(indsc);
		bint.setINDSF(indsf);
		bint.setINDSTE(indste);
		bint.setINDSTUD(indstud);
		bint.setOCONTROL(ocontrol);
		bint.setOUTBI(outbi);

		EvaluacionsinBuro evaluacionsinBuro = factory.createEvaluacionsinBuro();
		evaluacionsinBuro.setArg0(bint);
		evaluacionsinBuro.setArg1(0);

		Map<String, BeanValidationMode> props = new HashMap<>();
		props.put(JAXBContextProperties.BEAN_VALIDATION_MODE, BeanValidationMode.AUTO);
		JAXBContext context = JAXBContext.newInstance("s1motor", this.getClass().getClassLoader(), props);
		JAXBElement<EvaluacionsinBuro> element = factory.createEvaluacionsinBuro(evaluacionsinBuro);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty("jaxb.formatted.output", Boolean.TRUE);
		marshaller.marshal(element, validRequest);
	}

	@Override
	public String toString() {
		return validRequest.toString();
	}

}
