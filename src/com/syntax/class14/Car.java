package com.syntax.class14;

public class Car {

	//defining features of the car
	String make;
	String model;
	int year;
	String color;
	int speed;
	
	//define behavior, applicable to all the objects you create
	void drive() {
		System.out.println(make+" Car can drive");
	}
	void accelerate() {
		System.out.println(make+" Car can accelerate");
	}
	
	void makeNoise() {
		System.out.println(make+" Car makes noise");
	}
	void stop() {
		System.out.println(make+" Car stops");
		System.out.println("Car stops when you press brake");
	}
	

}
