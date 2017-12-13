package com.scmallorca.katas.roman;


public class RomanNumberConverter {

	public static final String ONE = "I";
	public static final String FIVE = "V";

	public static final String TEN = "X";

	public static String integerToRomanNumber(int number) {

		StringBuilder roman = new StringBuilder();

		if (number >= 10) {
			roman.append(TEN);
			number -= 10;
		}

		if (number < 4) {
			for (int i = 1; i <= number; i++) {
				roman.append(ONE);
			}
		} else if (isFour(number) || number == 9) {
			roman.append(ONE + (isFour(number) ? FIVE : TEN));
		} else if (number == 5) {
			roman.append(FIVE);
		} else if (number > 5) {
			roman.append(FIVE);
			for (int i = 6; i <= number; i++) {
				roman.append(ONE);
			}
		}

		return roman.toString();
	}

	private static boolean isFour(int number) {
		return number == 4;
	}
}
