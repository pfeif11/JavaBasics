package com.syntax.class01;

public class VariableDeclaration {
	public static void main(String[] args) {
		//create a variable and store value
		//1. declaring a variable and assigning a value
		boolean b=true;
		//2 way: 1st step - declare variable
		//       2nd step - assign value
		int i;
		i=1000;
		
		//declaring multiple variables and assign value later
		char x, y, z;
		x='A';
		y='^';
		z='0';
		//we cannot have variables with same name in 1 program
		//double i=12.99; --> java will complain, we already have a value for i
		
		z='#';//reassigning the value to # instead of 0
		i=2000;
		System.out.println(i);
		int num=100;
		int num1=100;
		
		System.out.println(z);
		
		
	}

}
