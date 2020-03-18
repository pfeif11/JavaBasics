package com.syntax.class08;

public class Continue {
	public static void main(String[] args) {
		
		for(int i=1; i<21; i++) {
			if(i==5 || i==6 || i==7) {
				continue;
			}
			System.out.println(i);
		}
		
		//write a program that prints numbers from 1 to 100
		//i do not wan to print 35-55
		
		for(int w=1;w<=100;w++) {
			if(w>=35 && w<=55) {
			continue;	
			}
			System.out.println(w);
		}
		
	
	}

}
