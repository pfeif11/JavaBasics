package com.syntax.class04;

import java.util.Scanner;

public class LoanSpecialist {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		
		System.out.println("Do you have a credit card? (Yes or No)");
	boolean answer1=shasta.nextBoolean();
	if(answer1) {
		System.out.println("What is the balance on your card?");
		int balance=shasta.nextInt();
		if(balance>1000) {
			System.out.println("Please pay off your balance immediately");
		}
		else {
			System.out.println("You can spend more");
		}
	}
	else {System.out.println("We can offer you a credit card");
	
	}

}
}
