package com.training;

public class Calculator {

	public int add(int num1,int num2) {
		return num1+num2;		
	}
	
	public int convertStringToNumber(String marks) { // "90"
		return Integer.parseInt(marks);		
	}
	// "90"  + 2	= 92
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("##FINALIZE CALLED");
	}
}
