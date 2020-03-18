package com.syntax.class04;

public class IfNesting {
	public static void main (String[] args) {
		
		boolean flag=false;
		boolean classToday=true;
		
		if (flag) {
			System.out.println("Hello");
			
			if (classToday) {
				System.out.println("Hello friends");
				
			} else {
				System.out.println("Hello family");
			}
		}
		else {
			System.out.println("Bye");
			
		}
		System.out.println("I am outside of the if condition");
	}

}
