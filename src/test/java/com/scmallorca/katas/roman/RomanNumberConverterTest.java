package com.scmallorca.katas.roman;


import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

	@Test
	public void oneToRoman() {

		givenNumberExpectingRoman(1, "I");
	}

	@Test
	public void twoToRoman() {

		givenNumberExpectingRoman(2, "II");
	}

	@Test
	public void fourToRoman() {

		givenNumberExpectingRoman(4, "IV");
	}

	@Test
	public void fiveToRoman() {

		givenNumberExpectingRoman(5, "V");
	}

	@Test
	public void sixToRoman() {

		givenNumberExpectingRoman(6, "VI");
	}

	@Test
	public void sevenToRoman() {

		givenNumberExpectingRoman(7, "VII");
	}

	@Test
	public void nineToRoman() {

		givenNumberExpectingRoman(9, "IX");
	}

	@Test
	public void tenToRoman() {

		givenNumberExpectingRoman(10, "X");
	}

	@Test
	public void elevenToRoman() {

		givenNumberExpectingRoman(11, "XI");
	}

	@Test
	public void fourteenToRoman() {

		givenNumberExpectingRoman(14, "XIV");
	}

	@Test
	public void fifteenToRoman() {

		givenNumberExpectingRoman(15, "XV");
	}

	@Test
	public void sixteenToRoman() {

		givenNumberExpectingRoman(16, "XVI");
	}

	@Test
	public void nineteenToRoman() {

		givenNumberExpectingRoman(19, "XIX");
	}

	@Test
	public void twentyToRoman() {

		givenNumberExpectingRoman(20, "XX");
	}

	private void givenNumberExpectingRoman(int number, String expectedRomanNumber) {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(number);

		Assert.assertEquals(expectedRomanNumber, romanNumber);
	}


}
