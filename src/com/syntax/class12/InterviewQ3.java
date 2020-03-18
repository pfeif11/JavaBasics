package com.syntax.class12;

public class InterviewQ3 {
	public static void main(String[] args) {
		//Write a Java Program to print first 10 numbers of Fibonacci series.
		//0,1,1,2,3,5,8,13,21,34
		int firstNumber=0;
		int sum=1;         
		int newSum;
		do {
			newSum=firstNumber+sum;
			
		} while(firstNumber==0);
		
		for(int y=0;y<10;y++) {
			sum=firstNumber+sum;
			System.out.println(sum);
		}
	}

}
