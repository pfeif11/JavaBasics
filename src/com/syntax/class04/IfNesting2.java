package com.syntax.class04;

public class IfNesting2 {
	public static void main (String[] args) {
		
		//declare date and a day. 
		//if day is Friday ----> if date 13, watch a scary movie
		// if day is Friday ----> if date is not 13, watch a comedy
		
		boolean isFriday=false;
		int date=13;
		
		if(isFriday) {
			System.out.println("Today is Friday, I am going to a movie");
			if(date==13) {
				System.out.println("I'll watch a scary movie");
			}
			else {
				System.out.println("I will watch a comedy");
				
			}
			
		} else {
			System.out.println("Today is not Friday, I'm staying home");
			
		}
	}

}
