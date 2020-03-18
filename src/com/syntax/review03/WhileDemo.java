package com.syntax.review03;

public class WhileDemo {
	public static void main(String[] args) {
		String greeting = "Hello";
		int x = 1;

		while (x <= 5) {
			x++;
			System.out.println(greeting);
			
		}
		
		x=1;
		System.out.println("-------------------------");
		while(true) {
			x++;
			System.out.println("Hello");
			if(x==6) {
				break;
			}
		}

	}

}
