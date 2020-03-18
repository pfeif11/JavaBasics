package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		
		int day=8;
		String today;
		//switch case preferable with multiple conditions
		switch(day) {
		case 1:
			today="Monday";
			//break;
		case 2:
			today="Tuesday";
			//break;
		case 3:
			today="Wednesday";
			//break;
		case 4:
			today="Thursday";
			//break;
		case 5:
			today="Friday";
			//break;
		case 6:
			today="Saturday";
			//break;
		case 7:
			today="Sunday";
			//break;
		//default:
			//today="Invalid";
			System.out.println("Today is "+today);
		}
		
		

	}

}
