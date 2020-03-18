package com.syntax.class09;

public class Task2 {
	public static void main(String[] args) {
		for(int a=1;a<=9;a++) {
			if(a<=5) {
				for(int b=1;b<=a;b++) {
					System.out.print("*");
				}
				System.out.println();
			}
			else {
				for(int b=9;b>=a;b--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}

}
