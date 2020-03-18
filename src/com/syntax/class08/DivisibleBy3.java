package com.syntax.class08;

public class DivisibleBy3 {
	public static void main(String[] args) {
		//Print numbers from 1 to 50 except those that are divisible by 3

		for(int number=1; number<=50;number++) {
			if(number%3==0) { 
				continue;
				
			}
			System.out.println(number);
		}
	}

}
