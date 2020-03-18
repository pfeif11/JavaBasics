package com.syntax.review03;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int total=0;
		System.out.println("Enter a number. To stop enter -1");
		int number=input.nextInt();
		
		while(number!=-1) {
			total+=number;
			System.out.println("Enter a number. To stop enter -1");
			number=input.nextInt();
			
		}
		System.out.println("The total is "+total);
		
		}

}
