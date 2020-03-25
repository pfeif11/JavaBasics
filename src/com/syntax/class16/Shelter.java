package com.syntax.class16;

public class Shelter {
	public static void main(String[] args) {
		//access instance variables from Dog
		Dog puppy=new Dog();
		puppy.name="Charlie";
		System.out.println(puppy.name);
		
		//access static variable from different class
		System.out.println(Dog.breed);
	}

}
