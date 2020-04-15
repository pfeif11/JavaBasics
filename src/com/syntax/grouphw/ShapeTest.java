package com.syntax.grouphw;

public class ShapeTest {

	
	public static void main(String[] args) {
		
		Shape c1=new Circle(15);
		c1.calculateArea();
		c1.calculatePerimeter();
		
		Shape s1=new Square(17);
		s1.calculateArea();
		s1.calculatePerimeter();
		//Shape[] shapes={c1,s1};
		//for(Shape s:shapes) {
		//s.calculateArea();
		//s.calculatePerimeter();
		//}
	}
}
