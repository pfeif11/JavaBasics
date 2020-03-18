package com.syntax.class05;

import java.util.Scanner;

public class Height {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		
		System.out.println("What is you height in inches?");
		int inches=shasta.nextInt();
		
		if(inches>0 && inches<60) {
			System.out.println("You are short");
		}
		else if(inches>=60 && inches<73) {
			System.out.println("You are medium");
			
		}
		else if(inches>72){
			System.out.println("You are tall");
		}
		else {
			System.out.println("Invalid height");
		}
	}

}
