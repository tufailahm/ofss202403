package com.training;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculatorTest3 {

	@ParameterizedTest(name = "{index} - {0} is a number")
	@ValueSource(ints = { 10, 10, 20, 30, 40 })
	void testDemo(int num) {
		//System.out.println(num);
	}
	
	@ParameterizedTest(name = "{index} - {0} is a palindrome")
	@DisplayName("Testing palindrome")
	@ValueSource(strings = { "omo", "malayalam", "dad", "mom" ,"sis" ,"naian"})
	public void testCheckPalindrome3(String word)
	{
		boolean expected=true;
		Palindrome palcheck = new Palindrome();
		boolean actual=palcheck.checkPalindrome(word);
		assertEquals(expected, actual);
	}
	//Hands on :  9,11  
	//12, 8
	//30,-10
	// 13, 7
	
	//  expected = 20;
	//create only one test method

	@ParameterizedTest(name = "{index} - {0} and {1} should be {2}")
	@DisplayName("Testing calculator add")
	@CsvFileSource(resources = "data.csv", numLinesToSkip = 1)
	public void testAdd(int num1,int num2,int expected)
	{
		Calculator calculator = new Calculator();
		int actual=calculator.add(num1,num2);
		assertEquals(expected, actual);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
