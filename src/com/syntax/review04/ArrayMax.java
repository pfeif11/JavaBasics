package com.syntax.review04;

public class ArrayMax {
	public static void main(String[] args) {
		// find largest and smallest numbers in a array

		int[] numbers = { 34, 67, 3, 93, 56, 72, 17,33 };
		
		int largest=numbers[0];
		int smallest=numbers[0];
		int sum=0;
		for(int num:numbers) {
			if(num>largest) {
				largest=num;
			}
			if(num<smallest) { 
				smallest=num;
				
			}
			sum=sum+num;
		}
		System.out.println("The largest number is "+largest);
		System.out.println("The smallest number is "+smallest);
		System.out.println("The sum of all numbers is "+sum);

	}

}
