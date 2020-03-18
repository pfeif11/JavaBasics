package com.syntax.class04;

import java.util.Scanner;

public class WorkedYears {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		System.out.println("How many years have you worked?");
		int years=shasta.nextInt();
		if(years>=5) {
			System.out.println("You are eligible for a bonus. What is your salary?");
			int salary=shasta.nextInt();
			if(salary>50000) {
				System.out.println("Your bonus will be $5000");
			}
			else {
				System.out.println("Your bonus will be $3000");
			}
			
		}
		else {
			System.out.println("You are no eligible for a bonus");
		}
	}

}
