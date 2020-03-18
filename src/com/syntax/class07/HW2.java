package com.syntax.class07;

public class HW2 {
	public static void main(String[] args) {
		//Print even numbers from 20 to 1 (2 ways)
		
		int number=20;
		
		while(number>=1) {
			if(number%2==0) {
				System.out.print(number+" ");
				
			}
			number--;
		}
	System.out.println("-----------------------------------------------");
	
	int num2=20;
	
	while (num2>=1) {
		System.out.print(num2+" ");
		num2-=2;
	}
	System.out.println("------------------------------------------------");
	//Print odd numbers between 20 and 50 (2 ways)
	
	int number2=20;
	while(number2<=50) {
		if(number2%2!=0) {
			System.out.print(number2+" ");
		}
		number2++;
	}
	System.out.println("-----------------------------------------------");
	int number3=21;
	while(number3<=50) {
		System.out.print(number3+" ");
		number3+=2;
	}
	
	System.out.println("---------------------------------------");
	for(int i=20;i>=50;i++) {
		if(i%2!=0) {
			System.out.print(i+" ");
		}
	}
	
	}

}
