package com.syntax.class05;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
		// Write a program to find largest of three double values using if-else..if and
		// logical operators provided by a user (numbers must be distinct)
		Scanner shasta = new Scanner(System.in);

		System.out.println("Please enter first number");
		double num1 = shasta.nextDouble();
		
		System.out.println("Please enter second number");
		double num2 = shasta.nextDouble();
		
		System.out.println("Please enter third number");
		double num3 = shasta.nextDouble();
		double largest = 0;
		if (num1 > num2 && num1 > num3) {
			largest=num1;
		} else if (num2 > num1 && num2 > num3) {
			largest=num2;
		} else if (num3 > num1 && num3 > num2) {
			largest=num3;
		}
		System.out.println("Largest number is "+largest);
	}

}
