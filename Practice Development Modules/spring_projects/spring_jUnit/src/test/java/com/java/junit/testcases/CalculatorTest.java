package com.java.junit.testcases;

import static org.junit.jupiter.api.Assertions.assertEquals;

// 1. Don' t use this annotation for Test 
// --->>cause individual test class gets terminated
//import org.junit.Test;

// Instead use this annotation
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;

import com.java.junit.module.Calculator;

public class CalculatorTest {

	// Static or non static methods for different annotations
	
	// Add @BeforeAll annotation to Static method

	// All the @Test annotation can be added for non-static test methods
	@Test
	public void CalcTest() {
		System.out.println(Calculator.add(12, 12));
		assertEquals(24, Calculator.add(12, 12));
	}

	// Add @AfterAll annotation to Static method
}
