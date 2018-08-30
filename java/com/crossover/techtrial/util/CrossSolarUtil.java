package com.crossover.techtrial.util;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * CrossSolarUtil class for cross solar project.
 * 
 * @author Murali
 *
 */
public class CrossSolarUtil {

	/**
	 * Generate a Alphanumeric Serial for panel.
	 * 
	 * @param length
	 *            to restrict with no.of characters
	 */
	public static String getAlphanumericSerial(int length) {

		String serialNumber = RandomStringUtils.randomAlphanumeric(length);
		return serialNumber;
	}

	/**
	 * Generate a AlphabeticSerial Serial for panel.
	 * 
	 * @param length
	 *            to restrict with no.of characters
	 */
	public static String getAlphabeticSerial(int length) {

		String serialNumber = RandomStringUtils.randomAlphabetic(length);
		return serialNumber;
	}

	/**
	 * Generate a NumericSerial Serial for panel.
	 * 
	 * @param length
	 *            to restrict with no.of characters
	 */
	public static String getNumericSerial(int length) {

		String serialNumber = RandomStringUtils.randomNumeric(length);
		return serialNumber;
	}

}
