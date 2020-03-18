package com.syntax.review03;

import java.util.Scanner;

public class Task2SecondWay {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int total=0;
		int number;
		
		do {
			System.out.println("Enter a number. To stop enter -1");
			number=input.nextInt();
			if(number==-1) {
				break;
			} else {
			total+=number;
		}
		
		
	}while(number!=-1);
System.out.println("The total is "+total);
}
}

