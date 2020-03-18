package com.syntax.class06;

import java.util.Scanner;

public class CapitalCity {

	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		String country="Philippines";
		String capitalCity;
		
		switch(country) {
		case"US":
			capitalCity="Washington D.C.";
			break;
		case "Russia":
			capitalCity="Moscow";
			break;
		case "China":
			capitalCity="Beijing";
			break;
		case "Albania":
			capitalCity="Tirana";
			break;
		case "Pakistan":
			capitalCity="Islamabad";
			break;
		case "Philippines":
			capitalCity="Manila";
			break;
		default:
			capitalCity="Not on my list";
			
			
		}
		System.out.println(country+"'s capital city is "+capitalCity);

	}

}
