package com.syntax.class33;

import java.util.Scanner;

public class Task1 {
//How would handle InputMismatchException? 
//Input Mismatch Exception when user enters
//mismatch value then programmer expected.
	
	
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		try {
			int num=scan.nextInt();
		} catch (Exception e) {
			System.out.println("InputMismatchException");
		}
		
	}
}
