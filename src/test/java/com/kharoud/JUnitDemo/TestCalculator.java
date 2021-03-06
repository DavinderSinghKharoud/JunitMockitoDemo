package com.kharoud.JUnitDemo;

import java.security.Provider.Service;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.*;

import com.kharoud.CalculateService;
import com.kharoud.Calculator;

import junit.framework.TestCase;

public class TestCalculator extends TestCase {

	Calculator c = null;
	
	//Fake Object
	@Mock
	CalculateService service;
	
	//We need to use @Rule, if we want to use mock annotation.
	@Rule public MockitoRule rule = MockitoJUnit.rule();
	
	@Before
	public void setUp() {
		c = new Calculator( service);
	}
	
	@Test
	public void testPerform() {
		
		when( service.add(2, 3)).thenReturn(5);
		assertEquals(10, c.perform(2, 3));
		verify(service).add(2, 3);
		
	}
}
