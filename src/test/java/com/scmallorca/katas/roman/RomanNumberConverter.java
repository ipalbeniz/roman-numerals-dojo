package com.scmallorca.katas.roman;


public class RomanNumberConverter {

	public static final String ONE = "I";

	public static String integerToRomanNumber(int number) {

		String roman = "";

		for (int i = 1; i <= number; i++) {
			roman += ONE;
		}

		return roman;
	}
}
