package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		//we are playing the lottery and lucky number is 17;
		//we want to ask the user any number 1-20 until she gets the lucky number
		//until she guessed the lucky number -----> congrats
		
		
		
		System.out.println("Please enter number 1-20");
		int num=shasta.nextInt();
			while(num>=1 && num <=20) {
				if(num!=17) {
					System.out.println("Please enter number 1-20");
					num=shasta.nextInt();
				}
				else {
					System.out.println("Congrats");
					break;
				}
			}
		}
		
	}


