package com.syntax.class08;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		// Write a program that reads a range of integers (start and end point),
		// provided by a user and then from that range prints
		// the sum of the even and odd integers.
		Scanner shasta = new Scanner(System.in);
		System.out.println("Please enter first number of the range");
		int firstNumber = shasta.nextInt();
		System.out.println("Please enter last number of the range");
		int lastNumber = shasta.nextInt();
		int totalEven = 0;
		int totalOdd = 0;
		for (int a = firstNumber; a <= lastNumber; a++) {
			if (a % 2 == 0) {
				totalEven = totalEven + a;
			} else {
				totalOdd = totalOdd + a;
			}
		}
		System.out.println("The total of the even numbers is " + totalEven);
		System.out.println("The total of the odd numbers is " + totalOdd);
	
		
		
		
		
		
	}

}
