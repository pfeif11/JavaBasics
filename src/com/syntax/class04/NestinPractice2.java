package com.syntax.class04;

public class NestinPractice2 {
	public static void main (String [] args) {
		double rate=3;
		double housePrice=200000;
		
		if(rate<=4.5) {
			System.out.println("User will consider buying a house");
			if(housePrice>200000) {
				System.out.println("User will take out a loan");
			}
			else {
				System.out.println("User will pay cash");
			}
			
		}
		else {
			System.out.println("User will not buy a house");
			
		}
		
	}

}
