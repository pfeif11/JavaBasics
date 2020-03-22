package com.syntax.class15;

public class EvenOrOdd {
	
	void compare(int a) {
		if(a%2==0) {
			System.out.println(a+" is an even number");
		}
		else {
			System.out.println(a+" is an odd number");
		}
	}
	
	public static void main(String[] args) {
		
		EvenOrOdd number=new EvenOrOdd();
		number.compare(15);
		number.compare(12);
		number.compare(100001);
	}

}
