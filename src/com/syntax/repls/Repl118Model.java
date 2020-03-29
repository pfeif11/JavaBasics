package com.syntax.repls;

public class Repl118Model {
	String name, capital;
	int population;
	
	void displayDetails() {
		System.out.println("The capital of "+name+" is "+capital+" and population is "+population);
	}
	
	public static void main(String[] args) {
		
		Repl118Model country1=new Repl118Model();
		country1.name="USA";
		country1.capital="Washington DC";
		country1.population=330000000;
		country1.displayDetails();
		
		Repl118Model country2=new Repl118Model();
		country2.name="Kazakhstan";
		country2.capital="Astana";
		country2.population=18500000;
		country2.displayDetails();
	}
	
	
	
	
}
