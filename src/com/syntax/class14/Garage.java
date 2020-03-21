package com.syntax.class14;

public class Garage {
	public static void main(String[] args) {
		//building individual objects
		Car car1=new Car();
		car1.make="BMW";
		car1.model="m135i";
		car1.year=2019;
		car1.color="black";
		System.out.println(car1.make);
		
		Car car2=new Car();
		car2.make="Volkswagen";
		car2.model="Jetta";
		car2.year=2019;
		car2.color="black";
		
		Car car3=new Car();
		
		//print bmw
		System.out.println(car1.make);
		//accesing behavior/methods of Car with
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		System.out.println("I drive "+car2.color+" "+car2.make);
		//create bike object
		
		//new Bike(); --> cannt create an object if we do not have a class
		
	}

}
