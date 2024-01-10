package com.java.junit.module;

public class Calculator {

	CalculatorService calcService;

	public Calculator(CalculatorService calculatorService) {
		calcService = calculatorService;
	}

	public int perform(int num1, int num2) {
//		return add(num1, num2);
		return calcService.add(num1, num2);

	}
	
	public int add(int num1, int num2) {
		return num1+num2;
	}

}
