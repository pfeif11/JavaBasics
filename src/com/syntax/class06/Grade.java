package com.syntax.class06;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		// Allow user to enter grade and then provide explanation: A-Excellent, B-Good,
		// C-Average, D-Bad, any other grade --> Not Acceptable. At the end your program
		// should print which grade was entered by a user with explanation.
		
	Scanner shasta=new Scanner(System.in);
		String grade;
		String feedback;
		
	System.out.println("Please input your grade");
	grade=shasta.nextLine();
	
	switch(grade) {
	case ("A"):
		feedback="Excellent";
		break;
	case ("B"):
		feedback="Good";
		break;
	case ("C"):
		feedback="Average";
		break;
	case ("D"):
		feedback="Bad";
		break;
	default:
		feedback="Not Acceptable";
	
	
	}
	System.out.println(grade);
	System.out.println(feedback);
	
	
	}

}
