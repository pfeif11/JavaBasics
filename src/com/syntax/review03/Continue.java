package com.syntax.review03;

public class Continue {
	public static void main(String[] args) {
		
		for(int age=1;age<=20;age++) {
			if(age==13) {
				continue;
			}
			System.out.println("Happy birthday, you are "+age+" years old");
			
		}
	}

}
