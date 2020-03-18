package com.syntax.class06;

import java.util.Scanner;

public class HW3 {
	// HomeWork: Using scanner class create calculator. Allow user to enter 2 numbers
	// and operator(+,-,*,/). Based on operator provide the result to user.
	
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		double num1;
		double num2;
		String operator;
		double result = 0;
		
		System.out.println("Please enter first number");
		num1=shasta.nextDouble();
		System.out.println("Please enter second number");
		num2=shasta.nextDouble();
		System.out.println("What operation would you like to perform? (+,-,*,/)");
		operator=shasta.next();
		
		switch(operator) {
		
		case("+"):
			result=num1+num2;
			break;
		case("-"):
			result=num1-num2;
			break;
		case("*"):
			result=num1*num2;
			break;
		case("/"):
			result=num1/num2;
			break;
		default:
			System.out.println("Invalid result");
			
		}
		
		System.out.println("The result is "+result);
		
	}

}
