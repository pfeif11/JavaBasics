package com.syntax.class08;

import java.util.Scanner;

public class Task4Again {
	public static void main(String[] args) {
//	Write a program to ask a user to enter item they want
//	to buy and the price of that item. 
//	Every time user enters money accumulate the amount and 
//	tell the user how much is left to pay off the amount. 
//	If user give more money program should return a change. 
//    Whenever a user done with payments program should say “Thank you for shopping!”
	Scanner shasta=new Scanner(System.in);
	System.out.println("What item would you like to buy?");
	String item=shasta.nextLine();
	System.out.println("What is the price of the item?");
	double price=shasta.nextDouble();
	double moneyGiven=0;
	double change;
	double remainingBalance;
	double totalMoney=0;
	
	do {
		System.out.println("Please enter money amount");
		moneyGiven=shasta.nextDouble();
		totalMoney=totalMoney+moneyGiven;
		
		if(price<totalMoney) {
			System.out.println("Please pay the remaining balance of "+(price-moneyGiven));
			
		}
		
	}
	while(moneyGiven<price);
	
	
	}
}
