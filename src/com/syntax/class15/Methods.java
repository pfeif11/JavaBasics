package com.syntax.class15;

public class Methods {

	//I want to create the method that will say welcome 10 times
	
	void sayWelcome() {
		for(int i=1;i<=10;i++) {
			System.out.println("Welcome");
		}
	}
	void sayWord(String word, int times) {
		for(int i=1;i<=times;i++) {
			System.out.println(word);
		}
	}
	
	//create a method isItRaining 
	//that will accept boolean value as
	//parameter and based on the value, it will print
	//message accordingly
	
	void isItRaining(boolean rain) {
		if(rain) {
			System.out.println("It is raining, stay at home and lern Java");
		}
		else {
			System.out.println("It is not raining, go for a walk");
		}
	}
	
	
	
	

}
