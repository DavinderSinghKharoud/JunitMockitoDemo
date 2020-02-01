package com.kharoud.JUnitDemo;

import java.security.Provider.Service;

import org.junit.Before;
import org.junit.Test;

import com.kharoud.CalculateService;
import com.kharoud.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {

	Calculator c = null;
	
	//Fake Object
	CalculateService service = new CalculateService() {
		
		public int add(int i, int j) {
			
			return i + j;
		}
	};
	
	
	@Before
	public void setUp() {
		c = new Calculator( service);
	}
	
	@Test
	public void testAdd() {
		assertEquals(10, c.perform(2, 3));
		
	}
}
