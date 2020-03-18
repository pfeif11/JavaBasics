package com.syntax.class05;

import java.util.Scanner;

public class WeekdayOrWeekend {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		
		int day=2;
		
		if(day>0 && day<6) {
			System.out.println("It is a weekday");
		}
		else if (day>5 && day<8) {
			System.out.println("It is a weekend");
		}
		else {
			System.out.println("Invalid day");
		}
	}

}
