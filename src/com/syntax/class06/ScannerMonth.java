package com.syntax.class06;

import java.util.Scanner;

public class ScannerMonth {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		
		System.out.println("Please enter number 1-12");
		int num1=shasta.nextInt();
		String month;
		
		if(num1==1) {
			month="January";
		}
		else if (num1==2) {
			month="February";
		}
		else if (num1==3) {
			month="March";
		}
		else if (num1==4) {
			month="April";
		}else if (num1==5) {
			month="May";
		}else if (num1==6) {
			month="June";
		}else if (num1==7) {
			month="July";
		}else if (num1==8) {
			month="August";
		}else if (num1==9) {
			month="September";
		}else if (num1==10) {
			month="October";
		}else if (num1==11) {
			month="November";
		}else if (num1==12) {
			month="December";
		} else {
			month="Invalid month";
		}
	System.out.println("The month is "+month);
	
	}

}
