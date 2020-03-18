package com.syntax.class07;

public class HW1 {
	public static void main (String[] args) {
		//Print numbers from 1 to 100 in 1 line with space
		int number=1;
		
		while(number<=100) {
			System.out.print(number+" ");
			number++;
		}
		System.out.println("--------------------------------------------------------");
		for(int number1=1;number1<=100;number1++) {
			System.out.print(number1+" ");
		}
		
		System.out.println("------------------------------------------------------------");
		////Print numbers from 100 to 1
		int number3=100;
		
		while(number3>=1) {
			System.out.print(number3+" ");
			number3--;
		}
		System.out.println("---------------------------------------------------------");
		
		for(int number4=100;number4>=1;number4--) {
			System.out.print(number4+" ");
		}
	}

}
