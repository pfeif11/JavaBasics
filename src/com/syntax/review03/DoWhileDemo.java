package com.syntax.review03;

public class DoWhileDemo {
	public static void main(String[] args) {
		
		int age=0;//just born
		
		while(age<10) {
			age++;
			System.out.println("Happy Birthday! You are "+age+" years old");
			
		}
		System.out.println("Now you are grown, you don't need a birthday celebration");
	
		int age2=0;
		do {
			age2++;
			System.out.println("Happy Birthday! You are "+age2+" years old");
		} while (age2<10);
		System.out.println("Now you are grown");
	
	}

}
