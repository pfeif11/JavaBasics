package com.syntax.class18;

public class Car {
	
	String make, model, color;
	int year,doors,wheels;
	
	public void printDetails() {
	System.out.println("I have a "+year+" "+make+" "+model+" in "+color+" color");	
		
	}
	
	
	
	
	public static void main(String[] args) {
		Car car1=new Car();// constructor initializes the values
		car1.printDetails();
		car1.make="BMW";
		car1.model="m5";
		car1.year=2020;
		car1.color="blue";
		car1.doors=2;
		car1.wheels=5;
		car1.printDetails();
		System.out.println("----------------------------------");
		
		
	}

}
