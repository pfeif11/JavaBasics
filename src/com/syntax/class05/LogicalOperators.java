package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperators {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// crtl+shift+o to import Scanner
		System.out.println("What is your age?");
		int age = scan.nextInt();

		if (age > 0) {
			if (age < 3) {
				System.out.println("You are a baby");
			} else if (age >= 3 && age <= 5) {
				System.out.println("You are a kid");

			} else if (age >= 6 && age < 13) {
				System.out.println("You are a child");

			} else if (age >= 13 && age < 20) {
				System.out.println("You are a teenager");
			} else if (age >= 20 && age < 65) {
				System.out.println("You are an adult");
			} else {
				System.out.println("You are enjoying your life");

			}
		} else {
			System.out.println("Invalid age");
		}

	}

}
