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



}
