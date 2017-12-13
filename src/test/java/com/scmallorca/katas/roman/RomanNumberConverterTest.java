package com.scmallorca.katas.roman;


import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

	@Test
	public void oneToRoman() {

		String romanNumber = RomanNumberConverter.integerToRomanNumber(1);

		Assert.assertEquals("I", romanNumber);
	}

}
