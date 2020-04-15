package com.syntax.grouphw;

public class Square implements Shape{
	double length;
	
	
	public Square(double length) {
		this.length=length;
	}
	@Override
	public void calculateArea() {
		System.out.println("The area of the Square is "+(length*length));
		
	}

	@Override
	public void calculatePerimeter() {
		System.out.println("The perimeter of the Square is "+(length*4));
		
	}

}
