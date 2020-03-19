package com.syntax.class13;

public class Q3 {
	public static void main(String[] args) {
		//first 10 numbers of fibonacci
		
		int a,b,c;
		a=0;
		b=1;
		
		
		for(int x=1;x<=10;x++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
			
		}
	}

}
