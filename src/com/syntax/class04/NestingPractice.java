package com.syntax.class04;

public class NestingPractice {
	public static void main (String[] args) {
		
		boolean hasDiploma=true;
		double score=3.5;
		
		
		if(hasDiploma) {
			System.out.println("Congratulations");
			if(score>=3.5)
			{System.out.println("You are eligible for a scholarship");
			
			}
			else {
				System.out.println("You should have studies harder");
			}
			
		}
		else {
			System.out.println("You should get a degree");
		}
				
	}

}
