package com.syntax.class23;

public class TestCar {

	public static void main(String[] args) {
		Car bmw=new BMW("BMW");
		Car tesla=new Tesla("Tesla");
		Car mercedes=new Mercedes("Mercedes");
		Car honda=new Honda("Honda");
		//arrayof objects
		Car [] cars={bmw, tesla, mercedes, honda};
		//Car c=new BMW ...and so on...
		for(Car c:cars) {
			c.start();
			c.display();
			System.out.println("---------------");
		}
		
		for(int i=0;i<cars.length;i++) {
			cars[i].start();
			cars[i].display();
		}
		
	}
}
