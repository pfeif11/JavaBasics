package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber2 {

	public static void main(String[] args) {
		
		//we are playing the lottery and lucky number is 17;
		//we want to ask the user any number 1-20 until she gets the lucky number
		//until she guessed the lucky number -----> congrats
				
	Scanner scan;
	int number;
	int luckyNumber=17;
	scan=new Scanner(System.in);
	
	
	
	do {
		System.out.println("Please enter any number from 1-20");
		number=scan.nextInt();
	
		
	} while(number!=luckyNumber);
	System.out.println("You got it!");

	}

}
