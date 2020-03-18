package com.syntax.class04;

import java.util.Scanner;

public class ScannerExamples2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("What is your name?");
		String name=input.nextLine();
		System.out.println("My name is "+name);
		System.out.println("What is your age?");
		int age=input.nextInt();
		System.out.println("Your name is "+name+" and you are "+age);
		
		
	}

}
