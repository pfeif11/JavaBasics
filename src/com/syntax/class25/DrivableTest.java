package com.syntax.class25;

public class DrivableTest {
	
	public static void main(String[] args) {
		
		//new Drivable(); cannot directly create object of interface
		Drivable obj=new Cars();
		obj.drive();
	}

}
