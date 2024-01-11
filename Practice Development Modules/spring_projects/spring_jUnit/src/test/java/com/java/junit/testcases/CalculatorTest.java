package com.java.junit.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;// Use for Test
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.java.junit.module.Calculator;


public class CalculatorTest {

	// Mock Creation - Method 1
	// Calculator cal = mock(Calculator.class);

	// Mock Creation - Method 2
	@Mock
	Calculator cal;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}


	// Invocation - Remember that each call to a method within Mockito methods
	@Test
	public void CalcTest() {
		assertEquals(cal.add(10, 10), cal.perform(10, 10));
		when(cal.perform(10, 10)).thenReturn(25);
		verify(cal).perform(10, 10);
	}

}
