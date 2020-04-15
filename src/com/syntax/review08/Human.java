package com.syntax.review08;

public class Human {
	String name; //instance variable
	static String planet; //class variable
	
	public Human(String name) {
		this.name=name;
	}
	
	public void talk() {
		System.out.println(name+" says hi there!");
	}

}
