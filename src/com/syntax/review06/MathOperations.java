package com.syntax.review06;

public class MathOperations {
	
	//can be accessed from everywhere
	public int add(int num1, int num2) {
		int sum=num1+num2;
		return sum;
	}
	//can be accessed from inside package and inheritance
	public void addNoReturn(int num1, int num2) {
		int addition=num1+num2;
		System.out.println("Printing the result " + "insdie the method "+addition);
		
	}
	//can be accessed from inside package (default)
	int multiply(int num1,int num2) {
		return num1*num2;
	}
	//can be accessed only within this class
	private void smth() {
		
	}

}
