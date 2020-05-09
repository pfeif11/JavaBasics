package com.syntax.class34;
class AgeException extends RuntimeException {
	public AgeException(String message) {
		super(message);
	}
}
public class Task1 {
	public static void main(String[] args) {
		age(60);
	}
	
	public static void age(int age) {
		if (age<20) {
			System.out.println("You are young");
		}
		if(age<40 && age>=20) {
			System.out.println("You are getting older");
		}
		else {
			throw new RuntimeException("Invalid age");
		}
	}

}
