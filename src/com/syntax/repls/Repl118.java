package com.syntax.repls;

public class Repl118 {
		  String country;
		  String capital;
		  long population;
		  
		  void displaySentence() {
		    
		    System.out.println("The capital of "+country+ " is "+capital+" and population is "+population);
		    
		  }
		  public static void main(String[] args) {
		    Repl118 country1=new Repl118();
		    country1.country="USA";
		    country1.capital="Washington DC";
		    country1.population=330000000;
		    country1.displaySentence();
		    
		    
		    Repl118 country2=new Repl118();
		    country2.country="Kazakhstan";
		    country2.capital="Astana";
		    country2.population=18500000;
		     country1.displaySentence();
		    
		    
		    
		    
		  }
		  
		}

