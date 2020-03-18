package com.syntax.class08;

public class MultiplicationTable {
	public static void main(String[] args) {
		//we want to create multiplication table
		//1*1=2
		//1*2=2
		//1*3=3
		
		int num=4;
		
		for(int i=1; i<=10;i++) {
			System.out.println(num+"*"+i+"="+i*num);
		}
	}

}
