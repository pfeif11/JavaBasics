package com.syntax.class23;

public class Car {
	
	String make;
	
	public Car(String make) {
		this.make=make;
	}
	
	public void display() {
		System.out.println("I have a "+make);
	}
	
	public void start() {
		System.out.println(make+" starts by turning key");
	}

}
class BMW extends Car {
	public BMW(String make) {
		super(make);
	}
	
	public void start() {
		System.out.println(make+" starts by pushing the button");
	}
	public void navigate() {
		System.out.println(make+" has nagivation");
	}
}

class Mercedes extends Car{
	public Mercedes(String make) {
		super(make);
	}
	
	public void start() {
		System.out.println(make+" starts remotely");
	}
}

class Tesla extends Car {
	public Tesla(String make) {
		super(make);
	}
	
	public void start() {
		System.out.println(make+" starts by voice command");
	}
}

class Honda extends Car {
	public Honda(String make) {
		super(make);
	}
}
