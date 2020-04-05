package com.syntax.class22;

public class CreditCard {
	
	double balance=100;
	double interest=.20;
	
	void calculateInterest() {
		System.out.println("The interest amount is "+(balance*interest));
	}

}
