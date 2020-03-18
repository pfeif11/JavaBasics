package com.syntax.class02;

public class Task2 {
	public static void main(String[] args) {
		float a = 12.35f;
		float b = 15.35f;
		float c = a + b;
		float d = a - b;
		float e = a / b;
		float f = a * b;

		System.out.println("The addition of two numbers " + a + " and " + b + " is equal to " + c);
		System.out.println("The addition of two numbers " + a + " and " + b + " is equal to " + (a+b));
		System.out.println("The subtraction of the two numbers " + a + " and " + b + " is equal to " + d);
		System.out.println("The multiplication of two numbers " + a + " and " + b + " is equal to " + f);
		System.out.println("The division of the two number " + a + " and " + b + " is equal to " + e);

		double g = 3.9;
		double s2 = g * g;

		System.out.println("The square of " + g + " is " + s2);

		int width = 5;
		int height = 8;
		int perimeter = 2*(width + height);
		int area = width * height;

		System.out.println("The perimeter of a rectangle is " +perimeter);
		System.out.println("The area of the rectangle is "+area);

	}

}
