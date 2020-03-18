package com.syntax.class05;

import java.util.Scanner;

public class Recap {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		
		System.out.println("Please enter any text");
		String text=shasta.nextLine();
		
		System.out.println("Please enter any text");
		String text1=shasta.next();
		
		System.out.println(text);
		System.out.println(text1);
		
		System.out.println("Please enter any numbers");
		int num=shasta.nextInt();
		
		System.out.println("Please enter decimal number");
		double num2=shasta.nextDouble();
		
		System.out.println(num);
		System.out.println(num2);
		
	}

}
