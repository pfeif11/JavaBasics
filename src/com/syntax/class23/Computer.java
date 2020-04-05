package com.syntax.class23;

public class Computer {
 String brand;
 Computer(String brand) {
	 this.brand=brand;
 }
 void display() {
	 System.out.println("I have "+brand+" computer");
 }
	 
 void login() {
	 System.out.println("With a "+brand+ " computer enter username and password");
 }
}

class Apple extends Computer {
	Apple(String brand) {
		super(brand);
	}
	
	
	
	void login() {
		System.out.println("With a "+brand+ " computer enter username and voice command password");
	}
}
class Lenovo extends Computer {
	Lenovo(String brand) {
		super(brand);
	
	}
	void login() {
		System.out.println("With a "+brand+ " computer use fingerprint to login");
	}
}

class HP extends Computer {
	HP(String brand) {
		super(brand);
	}
}

class Dell extends Computer {
	Dell(String brand) {
		super(brand);
	}
	void login() {
		System.out.println("With a "+brand+ " computer use facial recognition to login");
	}
}
