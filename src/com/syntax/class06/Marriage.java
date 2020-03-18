package com.syntax.class06;

import java.util.Scanner;

public class Marriage {

	public static void main(String[] args) {
	
		Scanner shasta=new Scanner(System.in);
		System.out.println("Is she beautiful?");
		boolean beautiful=shasta.nextBoolean();
		System.out.println("Are you rich?");
		boolean rich=shasta.nextBoolean();
		
		if(beautiful || rich) {
			System.out.println("I will marry her");
		}
		else {
			System.out.println("Are you a good person?");
			boolean goodPerson=shasta.nextBoolean();
			if(goodPerson) {
				System.out.println("I'll give you a chance");
			}
			else {
			System.out.println("Sorry, you are in a bad situation");
		}
		}

	}

}
