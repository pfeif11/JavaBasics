package com.syntax.class06;

import java.util.Scanner;

public class ScannerSwitch {

	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		
		char gender;
		String genderType = null;
		System.out.println("Please enter gender. M or F");
		gender=shasta.next().charAt(0);
		//ignoreCase is just for String, not char
		//
		switch(gender) {
		case 'M':
			genderType="Male";
			break;
		case 'F':
			genderType="Female";
			break;
		
		default:
			genderType="Unknown";	
		}
		System.out.println("Your gender is "+genderType);
	
		

	}

}
