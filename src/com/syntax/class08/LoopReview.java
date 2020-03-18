package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {
	public static void main(String[] args) {
//		As a user to pay for candy, as long as the entered price is not 2,
//       we need to keep asking for paying. one amount is correct -->"Enjoy your candy"
		Scanner shasta=new Scanner(System.in);
		double price;
		
//		do {
//		System.out.println("Please pay for a candy");
//		price=shasta.nextDouble();
//		
//		} while(price!=2); {
//			System.out.println("You got the right price!");
//		}
//		
		System.out.println("------------------------------------");
		System.out.println("Please pay for a candy");
		price=shasta.nextDouble();
		while(price!=2 ) {
			System.out.println("Please pay for a candy");
			price=shasta.nextDouble();
		} System.out.println("Enjoy your candy");
	}

}
