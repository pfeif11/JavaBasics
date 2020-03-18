package com.syntax.class08;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
//		Write a program that reads a range of integers (start and end point), 
//		provided by a user and then from that range prints the sum of the even and odd integers.

		Scanner shasta=new Scanner(System.in);
		System.out.println("Please provide starting number");
		int start=shasta.nextInt();
		System.out.println("Please provide ending number");
		int end=shasta.nextInt();
		int totalEven=0;
		int totalOdd=0;
	
		for(int a=start;a<=end;a++) {
			if(a%2==0) {
				totalEven=totalEven+a;
			}
			else {
				totalOdd=totalOdd+a;
			}
		}
		System.out.println(totalEven);
		System.out.println(totalOdd);
	}

}
