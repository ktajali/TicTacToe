package com.utm.csc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	double number1;
	double number2;
	Calculator calc;
	
	@Before
	public void setUp()
	{
		number1 = 5.5;
		number2 = 4.5;
		calc = new Calculator();
		
	}
	//test the addition method
	@Test
	public void testAddition()
	{
		double expectedAnswer = 10;
		double answer = calc.addition(number1, number2);
		assertEquals(expectedAnswer, 0.001 , answer);
	}
	
	//test subtraction method
	@Test
	public void testSubtraction()
	{
		double expectedAnswer = 1;
		double answer = calc.subtraction(number1, number2);
		assertEquals(expectedAnswer, 0.001 , answer);
	}	

	//test multiplication
	@Test
	public void testMultiplication()
	{
		double expectedAnswer = 24.75;
		double answer = calc.multiplication(number1, number2);
		assertEquals(expectedAnswer, 0.001 , answer);
	}
	//test division
	@Test
	public void testDivision()
	{
		double expectedAnswer = 1.22;
		double answer = calc.division(number1, number2);
		assertEquals(expectedAnswer, 0.001 , answer);
	}	
}
