package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {

		Scanner shasta = new Scanner(System.in);

		System.out.println("Please enter your country");
		String country;
		String favoriteFood;
		country = shasta.nextLine();

		switch (country.toLowerCase()) {
		case "morocco":
			favoriteFood = "Couscous";
			break;
		case "belarus":
			favoriteFood = "Potato";
			break;
		case "tajikistan":
			favoriteFood = "Osh";
			break;
		case "turkey":
			favoriteFood = "Baklava";
			break;
		case "afghanistan":
			favoriteFood = "Mantu";
		case "kazakhstan":
			favoriteFood = "Beshparmak";
			break;
		default:
			favoriteFood = "Unknown";

		}

		System.out.println("I am from "+country+" and my favorite food is "+favoriteFood);
	}

}
