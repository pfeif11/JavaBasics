package com.syntax.class06;

public class Recap {

	public static void main(String[] args) {
		
		int hour=25;
		String timeOfDay;
		
		if(hour>0 && hour<12) {
			timeOfDay="Morning";
		}
		else if(hour>11 && hour<16) {
			timeOfDay="Afternoon";
		}
		else if(hour>15 && hour<21) {
			timeOfDay="Evening";
		}
		else if(hour>20 && hour<25) {
			timeOfDay="Night";
		}
		else {
			timeOfDay="Unknown";
		}
		
		
		//if time of the day is not unknown, only then a response will show up
		if(!timeOfDay.equals("Unknown")) {
			System.out.println("Right now is "+timeOfDay);
		}



	}

}
