package com.syntax.class14;

public class MethodExamples {
	//create a method that will greet a person
	
	void greet() {
		System.out.println("Hello Tina");
	}
	void greet1(String name) {
		System.out.println("Hello "+name);
	}
	
	public static void main(String[] args) {
		//how do I call method greeting?
		MethodExamples object1=new MethodExamples();
		object1.greet1("Tina");
		object1.greet1("Mike");
		object1.greet1("Arek");
		object1.greet1("Kasia");
	}

}
