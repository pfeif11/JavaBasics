package com.syntax.class08;

import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {

//		Write a program to ask a user to enter item they want to buy 
//		and the price of that item. Every time user enters money accumulate
//		the amount and tell the user how much is left to pay off the amount. 
//		If user give more money program should return a change. 
//		Whenever a user done with payments program should say “Thank you for shopping!”
		Scanner shasta=new Scanner(System.in);
		double price;
		double money;
		double amount=0;
		double change;
		String item;
		double remainingBalance;
		
		
		
		System.out.println("What are you buying today?");
		item=shasta.nextLine();
		
		System.out.println("What is the price for the "+item);
		price=shasta.nextDouble();
		
		do {
			System.out.println("Please give me the payment");
			money=shasta.nextDouble();
			amount=amount+money;
		
		if(amount<price) {
			remainingBalance=price-money;
			System.out.println("Please give more "+remainingBalance);}
			else if (amount>price) {
				change=amount-price;
				System.out.println("Here is your change "+change);
				break;
				
			}
			else {
				System.out.println("Thank you");
			}
				
			} while(price!=amount);
		System.out.println("Thank you for shopping");
		}
		
		
		
				
		
		
		
	}


