package com.scmallorca.katas.roman;


import org.junit.Assert;
import org.junit.Test;

public class RomanNumberConverterTest {

	@Test
	public void oneToRomanNumber() {

		String romanNumber = RomanNumberConverter.convert(1);

		Assert.assertEquals("I", romanNumber);
	}

}
