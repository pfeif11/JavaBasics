package com.syntax.review06;

public class Baby {
	
	String firstName;
	String lastName;
	char gender;
	int weight;
	String hairColor;
	
	public void walk() {
		System.out.println("Crawling...");
	}
	public String cry() {
		
		return "Cry every minute";
	}
	public void talk(int times) {
		for(int i=1; i<=times;i++) {
		System.out.print("Blah ");
		}
	}
	public void displayBabyInfo() {
		System.out.println("full name of baby 2 "+firstName+" "+lastName);
		System.out.println("Gender is "+gender);
		System.out.println("Hair color is "+hairColor);
			
	}

}
