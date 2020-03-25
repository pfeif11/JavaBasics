package com.syntax.class17;

public class StaticKeyword {
	
	//create a template for a Phone
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	//we have to specify return type, name, and parameters or no parameters
	static void displayGeneralInfo() {
		System.out.println("We are building "+brand+" with touchscreen= "+touchScreen);
	}
	void displaySpecs() {
		System.out.println("We build phone with "+memory+"GB memory in "+color+" color");
	}
	public static void main(String[] args) {
		//accessing static variables in a static way
		brand="iPhone";
		touchScreen=true;
		//accessing instance variables through the instance if the class
		StaticKeyword obj=new StaticKeyword();
		obj.color="grey";
		obj.memory=64;
		//accessing static method in a static way
		StaticKeyword.displayGeneralInfo();
		obj.displaySpecs();
		//accessing static method in a non static way (valid but not preferable)
		obj.displayGeneralInfo();
		
	}

}
