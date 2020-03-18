package com.syntax.class10;

public class Task3InClass {
	public static void main(String[] args) {
		String[] countries = { "USA", "Poland", "Ukraine", "Turkey", "Spain" };
		for (int y = 0; y < countries.length; y++) {
		            switch(countries[y]) {
		            
		            case "USA":
		                System.out.println("The capital is Washington DC");
		                break;
		            case "Poland":
		                System.out.println("The capital is Warsaw");
		                break;
		            case "Ukraine":
		                System.out.println("The capital is Kiev");
		                break;
		            case "Turkey":
		                System.out.println("The capital is Ankara");
		                break;
		            case "Spain":
		                System.out.println("The capital is Madrid");
		                break;
		            }
		            
		}
	}

}
