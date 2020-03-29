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
		
	}

}
