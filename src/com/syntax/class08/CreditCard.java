package com.syntax.class08;

import java.util.Scanner;

public class CreditCard {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		//create a program that will be asking user to apply for a credit card 10 times. 
		//As soon you get an “yes” from a user program should stop asking.
		
		for(int times=1;times<=10;times++) {
			System.out.println("Do you want to apply for a credit card?");
			String answer=shasta.nextLine();
			if(answer.equals("yes")) {
				break;
			}
			
		}
		
		
	}

}
