package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample3 {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		System.out.println("How old are you?");
		int number=shasta.nextInt();
		if(number<18) {
			System.out.println("You are eligible for a learner's permit");}
		
			else {
				System.out.println("You will be issued a driver's license");
				
			}
		}
		
	}


