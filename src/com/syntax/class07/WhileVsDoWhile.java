package com.syntax.class07;

public class WhileVsDoWhile {
	public static void main(String[] args) {
		//hello 5 times, first we are checking the condition, if true, we go inside block of code
		int num=11;
		
		while(num<=5) {
			System.out.println("Hello");
			num++;
		}
		
		System.out.println("------USING DO WHILE------------");
		//hello 5 times, first we go inside the code and execute, and then checks the condition
		int num1=11;
		do {
			System.out.println("Hello");
			num1++;
		} while(num1<=5);
	}

}
//they both work the same as long as the condition is true
