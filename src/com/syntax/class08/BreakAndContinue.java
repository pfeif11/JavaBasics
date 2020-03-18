package com.syntax.class08;

public class BreakAndContinue {
	public static void main(String[] args) {
		
		
			//once i=4 -->we wan to stop the loop
			for(int i=1; i<=10; i++) {
				if(i==4) {
					System.out.println("I am stopping the loop");
					break;
				}
				System.out.println(i);
			}
		System.out.println("I am outside of the loop");
		
		System.out.println("----------------------------------------------");
		for(int y=1;y<=10;y++) {
			if(y==4) {
				System.out.println("I am skipping iteration");
				continue; //used to skip the entire code and just go back to line 18
			}
			System.out.println("I am inside the loop");
			System.out.println(y);
		}
		
	}

}
