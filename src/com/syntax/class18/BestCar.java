package com.syntax.class18;

public class BestCar {
	String make, model, color;
	int year,doors,wheels;
	
	public void printDetails() {
	System.out.println("I have a "+year+" "+make+" "+model+" in "+color+" color");	
		System.out.println(make+" will have "+doors+" doors and "+wheels+" wheels");
	}
	
	
	
	BestCar(String carMake,String carModel,String carColor, int carYear, int carDoors, int carWheels) {
		make=carMake;
		model=carModel;
		color=carColor;
		year=carYear;
		doors=carDoors;
		wheels=carWheels;
	}
	public static void main(String[] args) {
		//once we create our own constructor, compiler WILL NOT be creating a default constructor for you!!!
		//BestCar car=new BestCar(); --->CE
		BestCar car=new BestCar("bmw", "m5", "Grey", 2020, 4, 5);
		car.printDetails();
	}

}
