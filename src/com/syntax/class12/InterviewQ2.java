package com.syntax.class12;

public class InterviewQ2 {
	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not
		
		int i=2;
		boolean y=false;
		
		for(int a=2;a<=i/2;a++)  {
			if(i%a==0) {
				y=true;
				break;
				
			}
		}
		if(y) {
			System.out.println(i+" is a non prime number");
		}
		else {
			System.out.println(i+" is a prime number");
		}
		
			
		
		
		
	}

}
