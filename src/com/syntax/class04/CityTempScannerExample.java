package com.syntax.class04;

import java.util.Scanner;

public class CityTempScannerExample {
	public static void main (String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Which city do you live?");
		String city=input.nextLine();
		
		System.out.println("What temperature is it?");
		double temperature=input.nextDouble();
		
		System.out.println("The temperature in the city "+city+" is "+((temperature-32)/1.8));
	
		
		
	}

}
