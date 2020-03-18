package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {
	public static void main(String[] args) {
		
		Scanner shasta=new Scanner(System.in);
		int num=1;
		
		while(num<=5) {
		System.out.println("What is your name");
		String name=shasta.nextLine();
		System.out.println("Good afternoon, "+name);
		num++;
		}
		System.out.println("-----------------------------------------------");
		//we are playing the lottery and lucky number is 17;
		//we want to ask the user any number 1-20 until she gets the lucky number
		//until she guessed the lucky number -----> congrats
		
		}
		
		
	}


