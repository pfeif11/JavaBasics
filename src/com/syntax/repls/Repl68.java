package com.syntax.repls;

public class Repl68 {
	public static void main(String[] args) {
//		For you to do: 
//			Write a program to print out the pattern: 
//
//			 
//			$$$$
//			$  $
//			$  $
//			$$$$
		
		for(int row=1;row<=4;row++) {
			for(int col=1;col<=4;col++) {
				if(row==1 || col==1 || col==4 || row==4) {
					System.out.print("$");
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
			
	}

}
