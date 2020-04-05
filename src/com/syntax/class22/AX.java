package com.syntax.class22;

public class AX extends CreditCard{
	double balance=100;
	double interest=.15;
	
	void calculateInterest() {
		System.out.println("The interest amount is "+(balance*interest));
	}

}
