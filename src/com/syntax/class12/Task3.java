package com.syntax.class12;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		
		Scanner shasta=new Scanner(System.in);
		
		System.out.println("Mom's first name?");
		String mom=shasta.next();
		System.out.println("Dad's first name");
		String dad=shasta.next();
		System.out.println("boy or girl?");
		String kid=shasta.next();
		
		if(kid.equalsIgnoreCase("boy")) {
			String b=dad.substring(0,dad.length()/2);
			String g=mom.substring(mom.length()/2,mom.length());
			System.out.println(b+g);
			
			
		}
		else if (kid.equalsIgnoreCase("girl")) {
			String g=mom.substring(0,mom.length()/2);
			String b=dad.substring(dad.length()/2,dad.length());
			System.out.println(g+b);
			
			
		} else {
			System.out.println("Invalid input");
		}
		
		
			
		
	}

}
