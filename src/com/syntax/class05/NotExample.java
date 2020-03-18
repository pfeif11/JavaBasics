package com.syntax.class05;

import java.util.Scanner;

public class NotExample {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		/*You are a salesman
		 * ask a user for price of the item
		 * based on the amount of sales, we need to calculate commission
		 * if sales is between 1-100, commission is 10% of sales
		 * if sales is between 100 and 200, 20% of sales
		 * if sales is between 200-500, 30% of sales
		 * if sales more than 500, 50% of sales
		 */
		
		System.out.println("Please enter your sales amount.");
		double sales=scan.nextDouble();
		double commission;
		
		if(sales>=1 && sales<=100) {
			commission=sales*0.10;
		}
		else if(sales>100 && sales<=200) {
			commission=sales*0.20;
		}
		else if (sales>200 && sales<=500) {
			commission=sales*0.30;
		}
		else {
			commission=sales*0.50;
		}
		System.out.println("Based on your sales your commission is ="+commission);
		 if(commission>100) {
			 System.out.println("You are an awesome salesman!");
		 }
		
	}

}
