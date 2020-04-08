package com.syntax.class24;

public abstract class Vehicle {
	
	String color;
	static int totalVehicles;
	
	Vehicle(String color) {
		this.color=color;
		totalVehicles++;
	}
	
	public static void total() {
		System.out.println(totalVehicles);
	}
	public void drive() {
		
	}
	
	public void stop() {
		
	}
	
	public abstract void start();
	
	public abstract void brake();
}

abstract class Car extends Vehicle{
	
	String carType;
	Car(String color, String carType) {
		
		super(color);
		this.carType=carType;
	}
	public void brake() {
		System.out.println(carType+" have brakes");
	}
}

class Tesla extends Car{
	String make;
	
	Tesla(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
	}
	
	
	public void drive() {
		System.out.println(make+" drives on autopilot");
	}
	@Override
	public void start() {
		System.out.println(make+" starts remotely");
		
	}
	
	
}

class Toyota extends Car {
	String make;
	
	Toyota(String color, String carType, String make) {
		super(color, carType);
		this.make=make;
		
	}



	@Override
	public void start() {
		System.out.println(make+" starts keyless");
		
	}
	
}
