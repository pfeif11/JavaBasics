package com.syntax.class04;

import java.util.Scanner;

public class Gender {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age=shasta.nextInt();
		System.out.println("Please enter your gender: M or F");
		String gender=shasta.next();
		
		if(age>25) {
			if(gender.equals("F")) {
				System.out.println("Woman");
			}
			else {
				System.out.println("Man");
			}
		}
		else {
			if(gender.equals("F")) {
				System.out.println("Girl");
			}
			else {
				System.out.println("Boy");
			}
		}
		
	}

}
