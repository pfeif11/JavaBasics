package com.syntax.class15;

public class Larger {
	

	void compare(int a,int b) {
		if(a>b) {
			System.out.println(a+" is larger than "+b);
		}
		else if(a==b) {
			System.out.println("Both numbers are equal");
		}
		else {
			System.out.println(b+" is larger than "+a);
		}
	}
	public static void main(String[] args) {
		Larger numbers=new Larger();
		numbers.compare(12,12);
		numbers.compare(11,12);
		numbers.compare(4, 0);
		
	}

}
