package com.syntax.grouphw;

public class Circle implements Shape {
	double diameter;
	
	public Circle(double diameter) {
		this.diameter=diameter;
	}
	@Override
	public void calculateArea() {
		System.out.println("The area of the circle is "+(3.14*((diameter/2)*(diameter/2))));
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of the Circle is "+(3.14*diameter));
		
	}

}
