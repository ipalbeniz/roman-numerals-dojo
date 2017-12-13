package com.scmallorca.katas.roman;


public class RomanNumberConverter {

	public static final String ONE = "I";
	public static final String FIVE = "V";

	public static String integerToRomanNumber(int number) {

		StringBuilder roman = new StringBuilder();

		if (number < 4) {
			for (int i = 1; i <= number; i++) {
				roman.append(ONE);
			}
		} else if (number == 4) {
			return ONE + FIVE;
		} else if (number == 5) {
			return FIVE;
		} else if (number > 5) {
			roman = new StringBuilder(FIVE);
			for (int i = 6; i <= number; i++) {
				roman.append(ONE);
			}
		}

		return roman.toString();
	}
}
