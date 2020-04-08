package com.syntax.class24;

public class VehicleTest {
	
	public static void main(String[] args) {
		
		Vehicle tesla=new Tesla("yello","Sedan","Tesla");
		tesla.drive();
		tesla.stop();
		tesla.brake();
		tesla.start();
		//tesla.drive(); CE -method is not defined in Vehicle
		
		Vehicle toyota1=new Tesla("red","Sedan","toyota");
		Vehicle toyota2=new Tesla("yello","Sedan","toyota");
		Vehicle.total();
		
		
	}

}
