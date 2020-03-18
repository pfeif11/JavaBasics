package com.syntax.class05;

public class MoreLogicalOperators {
	public static void main(String[] args) {
//		int day=8;
//		
//		if(day==2 || day==3) {
//			System.out.println("We have SDLC Class");
//		}
//		else if (day==6 || day==7) {
//			System.out.println("We have Java Class");
//		}
//		else if (day==1 || day==5) {
//			System.out.println("We are off");
//		}
//		else if (day==4) {
//			System.out.println("We have review class");
//			
//		}
//		else {
//			System.out.println("Invalid day");
//		}
		
	String day1="Monday";
		//to compare strings, we use   .equals
	   // to compare numbers, we use ==
		if(day1.equals("Tuesday") || day1.equals("Wednesday")) {
			System.out.println("We have SDLC Class");
		}
		else if (day1.equals("Sunday") || day1.equals("Saturday")) {
			System.out.println("We have Java Class");
		}
		else if (day1.equals("Monday")|| day1.equals("Friday")) {
			System.out.println("We are off");
		}
		else if (day1.equals("Thursday")) {
			System.out.println("We have review class");
			
		}
		else {
			System.out.println("Invalid day");
		}
		
		
		
		
	}

}
