package com.syntax.class04;

import java.util.Scanner;

public class ScannerAndVerificationPractice {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		
		System.out.println("Please input number 1");
		int num1=shasta.nextInt();
		System.out.println("Please input number 2");
		int num2=shasta.nextInt();
		if(num1>num2) {
			System.out.println(num1+" is larger than "+num2);
		}
		else if(num2>num1) {
			System.out.println(num2+" is larger than "+num1);
			
		}
		else {
			System.out.println(num1+" is equal to "+num2);
			
		}
	}

}
