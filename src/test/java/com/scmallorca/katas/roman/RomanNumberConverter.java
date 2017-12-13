package com.scmallorca.katas.roman;


public class RomanNumberConverter {

	public static final String ONE = "I";
	public static final String FIVE = "V";

	public static String integerToRomanNumber(int number) {

		String roman = "";

		if (number < 4) {
			for (int i = 1; i <= number; i++) {
				roman += ONE;
			}
		} else if (number == 4) {
			return ONE + FIVE;
		} else if (number == 5) {
			return FIVE;
		}

		return roman;
	}
}
