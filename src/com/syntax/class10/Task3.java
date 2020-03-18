package com.syntax.class10;

public class Task3 {
	public static void main(String[] args) {
		//Create an array of countries. 
		//While retrieving all values from an array 
		//print capital for each country. (use 2 different loops).
		
		String countries[]= {"Philippines","Portugal","Poland","Vietnam","Cambodia"};
		
		for(String country:countries) {
			if(country.equals("Philippines")) {
				System.out.println("Manila");	
			}
			else if(country.equals("Portugal")) {
				System.out.println("Lisbon");
			}
			else if(country.equals("Poland")) {
				System.out.println("Warsaw");
			}
			else if(country.equals("Vietnam")) {
				System.out.println("Hanoi");
			}
			else if(country.equals("Cambodia")) {
				System.out.println("Phnom Penh");
			}
		}
		
	        
	        System.out.println("------------------------------------------");
	        for(int y=0;y<countries.length;y++) {
	        	switch(countries[y]) {
	        	case"Philippines":
	        		System.out.println("The capital is Manila");
	        		break;
	        	case "Portugal":
	        		System.out.println("The capital is Lisbon");
	        		break;
	        	case "Poland":
	        		System.out.println("The capital is Warsaw");
	        		break;
	        	case "Vietnam":
	        		System.out.println("The capital is Hanoi");
	        		break;
	        	case "Cambodia":
	        		System.out.println("The capital is Phnom Penh");
	        	}
	        }
	        
			
			}
		}
		

		
		
		
		
		
			
		

	


