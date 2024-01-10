package com.java.junit.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;

// 1. Don' t use this annotation for Test 
// --->>cause individual test class gets terminated
//import org.junit.Test;

// Instead use this annotation
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.java.junit.module.Calculator;

/*
 * 			3 Ways to enable Mockito annotation
 *  
 *  1. @ExtendWith(MockitoExtension.class) 
 *  	Add to the test class - not working
 *  
 *  2. Add MockitoAnnotations.openMocks(this) in a setup method 
 *  	with @BeforeEach annotation - working
 *  
 *  3. Check later
 */
/**********************************************************************/
/*
 * 			Static or non static methods for different annotations
 * 
 * 1. @BeforeAll annotation to Static method 2. @AfterAll annotation to Static
 * method 3. @Test annotation to Non-static test method
 */

/*********************************************************************/

/*
 * openMocks is mandatory to add if @Mock annotation is used
 * 
 * @BeforeEach void init() { MockitoAnnotations.openMocks(this); }
 * 
 * test methods always need to be public, void - because Reflection is used
 */

public class CalculatorTest {
	final int var1 = 10;
	final int var2 = 20;

	// Mock Creation - Method 1
	// Calculator cal = mock(Calculator.class);

	// Mock Creation - Method 2
	@Mock
	Calculator cal;
	
	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}
	
	/******************************************************************/
	
	// Invocation - Remember that each call to a method within Mockito methods
	@Test
	public void CalcTest() {
		assertEquals(cal.add(10, 10), cal.perform(10, 10));
		when(cal.perform(10, 10)).thenReturn(25);
		verify(cal).perform(10, 10);
	}
	
	
	

}
