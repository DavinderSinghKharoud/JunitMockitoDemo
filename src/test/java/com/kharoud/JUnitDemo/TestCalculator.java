package com.kharoud.JUnitDemo;

import org.junit.Test;

import com.kharoud.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {

	Calculator c = new Calculator();
	
	@Test
	public void testAdd() {
		assertEquals(5, c.add(2, 3));
		
	}
}
