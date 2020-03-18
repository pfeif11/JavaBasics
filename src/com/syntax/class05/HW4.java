package com.syntax.class05;

import java.util.Scanner;

public class HW4 {
	public static void main(String[] args) {
		// Program to find largest number among three numbers using nested if provided
		// by a user (numbers must be distinct)
		Scanner shasta=new Scanner(System.in);
		
		System.out.println("Please enter first number");
		double num1=shasta.nextDouble();
		System.out.println("Please enter second number");
		double num2=shasta.nextDouble();
		System.out.println("Please enter third number");
		double num3=shasta.nextDouble();
		double largest = 0;
		if(num1>num2) {
			if(num1>num3) {
				largest=num1;
			}
			else {
				largest=num3;
			}
		}
		else {
			if (num2>num3) {
				largest=num2;
			}
			else {
				largest=num3;
			}
		}

		System.out.println(largest+" is the largest number");
			
		
		

	}

}
