package com.syntax.class13;

public class Q2 {
	public static void main(String[] args) {
		//Write a java program to check whether a given number is prime or not
		
		int given=7;
		boolean isPrime=true;
		
		if(given>1) {
			for(int i=2;i<given;i++) {
				if(given%i==0) {
					isPrime=false;
					break;
				}
				
			}
			
		}
		else {
			isPrime=false;
			
		}
		System.out.println("Given number "+given+" is prime? "+isPrime);
		
		
		
	}

}
