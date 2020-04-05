package com.syntax.class22;

public class Visa extends CreditCard{
	
	double balance=100;
	double interest=.30;
	void calculateInterest() {
		System.out.println("The interest amount is "+(balance*interest));
	}

}
