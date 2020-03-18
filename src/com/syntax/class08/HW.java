package com.syntax.class08;

import java.util.Scanner;

public class HW {
	public static void main(String[] args) {
		Scanner shasta = new Scanner(System.in);

		System.out.println("Please enter two strings");
		String word1 = shasta.next();
		String word2 = shasta.next();
		System.out.println("Please enter two numbers");
		int num1 = shasta.nextInt();
		int num2 = shasta.nextInt();
		String output;
		if ((num1 == num2) && (word1.equals(word2))) {
			output = "AND";
		} else if ((num1 == num2) || (word1.equals(word2))) {
			output = "OR";
		} else {
			output = "NONE";
		}
		System.out.println(output);
	}
}
