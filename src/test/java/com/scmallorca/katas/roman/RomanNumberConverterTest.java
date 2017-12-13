package com.scmallorca.katas.roman;


import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

	@Test
	public void oneToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(1);

		Assert.assertEquals("I", romanNumber);
	}

	@Test
	public void twoToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(2);

		Assert.assertEquals("II", romanNumber);
	}

	@Test
	public void fourToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(4);

		Assert.assertEquals("IV", romanNumber);
	}

	@Test
	public void fiveToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(5);

		Assert.assertEquals("V", romanNumber);
	}

	@Test
	public void sixToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(6);

		Assert.assertEquals("VI", romanNumber);
	}

	@Test
	public void sevenToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(7);

		Assert.assertEquals("VII", romanNumber);
	}

	@Test
	public void nineToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(9);

		Assert.assertEquals("IX", romanNumber);
	}

	@Test
	public void tenToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(10);

		Assert.assertEquals("X", romanNumber);
	}



}
