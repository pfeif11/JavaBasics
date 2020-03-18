package com.syntax.class08;

public class TaskInClass {
	public static void main(String[] args) {
		
		//write a program to calculate sum of odds & sum of even numbers 1 to 99
		
		int total=0;
		int oddtotal=0;
		
		for(int number=1;number<=99;number++) {
			if(number%2==0) {
				total=total+number;
				
			} else {
				oddtotal=oddtotal+number;
			}
			
		}
		System.out.println(total);
		System.out.println(oddtotal);
		
	}

}
