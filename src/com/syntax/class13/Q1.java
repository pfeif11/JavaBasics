package com.syntax.class13;

public class Q1 {
	public static void main(String[] args) {
//		Write a program to swap 2 numbers without a temporary variable
//		Swap  2 strings without a temporary variable
		
		int x=45;
		int y=55;
		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("The value of x is "+x);
		System.out.println("The value of y is " +y);
	}

}
