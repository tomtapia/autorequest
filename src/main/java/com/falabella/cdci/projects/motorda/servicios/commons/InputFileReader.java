package com.falabella.cdci.projects.motorda.servicios.commons;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InputFileReader {

	private Scanner scanner;
	private FileReader fileReader;
	private File inputFile = null;
	private boolean fileRead = false;
	private Map<String, String[]> busValues;
	private Map<String, String[]> motorValues;

	public InputFileReader(URI fileName) throws FileNotFoundException {
		this.inputFile = new File(fileName);
		this.busValues = new HashMap<String, String[]>();
		this.motorValues = new HashMap<String, String[]>();
		readFile();
	}

	private boolean validate() throws FileNotFoundException {
		if (!inputFile.exists())
			throw new FileNotFoundException("Archivo no encontrado, " + inputFile.getName());
		this.fileReader = new FileReader(inputFile);
		this.scanner = new Scanner(this.fileReader);
		return true;
	}

	private void readFile() throws FileNotFoundException {
		validate();
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String value = line.split("\\,")[0];
			String keyBus = line.split("\\,")[1];
			String keyMotor = line.split("\\,")[2];
			if (busValues.containsKey(keyBus)) {
				String[] currentValues = busValues.get(keyBus);
				String[] newValues = Arrays.copyOf(currentValues, currentValues.length + 1);
				newValues[currentValues.length] = value;
				busValues.put(keyBus, newValues);
			} else {
				busValues.put(keyBus, new String[] { value });
			}
			if (motorValues.containsKey(keyMotor)) {
				String[] currentValues = motorValues.get(keyMotor);
				String[] newValues = Arrays.copyOf(currentValues, currentValues.length + 1);
				newValues[currentValues.length] = value;
				motorValues.put(keyMotor, newValues);
			} else {
				motorValues.put(keyMotor, new String[] { value });
			}
		}
		this.fileRead = true;
	}

	public Map<String, String[]> getBusValues() {
		if (fileRead)
			return busValues;
		else
			return null;
	}

	public Map<String, String[]> getMotorValues() {
		if (fileRead)
			return motorValues;
		else
			return null;
	}

}
