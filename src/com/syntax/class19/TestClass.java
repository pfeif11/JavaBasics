package com.syntax.class19;

public class TestClass {
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		//able to access variables from Dog class and parent class (Animals)
		dog1.breed="Husky";
		dog1.color="Grey";
		dog1.fur="Too much";
		dog1.size="Big";
		
		dog1.bark();
		dog1.beWild();
		dog1.eat();
		dog1.sleep();
		
		Animals animal1=new Animals();
		animal1.color="Any";
		animal1.size="Any";
		//animal1.breed="Any"; -->as a parent, cannot access features from the child class
		
		
	}

}
