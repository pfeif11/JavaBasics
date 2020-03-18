package com.syntax.class06;

import java.util.Scanner;

public class CountryLanguage {
	public static void main(String[] args) {
		
		//Ask user to enter their country and capture it. Once values are captured print which language user speaks.
		
		Scanner shasta=new Scanner(System.in);
		
		String country;
		String language;
		System.out.println("Please enter your country");
		country=shasta.nextLine();
		
		switch(country) {
		case ("Philippines"):
			language="Tagalog";
			break;
		case("Poland"):
			language="Polish";
			break;
		case("Colombia"):
			language="Spanish";
			break;
		case("Portugal"):
			language="Portuguese";
			break;
		case("Croatia"):
			language="Croatian";
		break;
		default:
			language="Unknown";
				
		
		}
		System.out.println("I am from the "+country+" and the language I speak is "+language);
	
	}

}
