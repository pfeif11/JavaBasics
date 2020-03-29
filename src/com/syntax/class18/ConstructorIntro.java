package com.syntax.class18;

public class ConstructorIntro {
	
//	ConstructorIntro() {
//		
//	}
	//to create a constructor 1. no return type (not even void)
	//						  2. name must be the same as class name
	
	ConstructorIntro() {
		System.out.println("I am a constructor");
		
	}
	
	public static void main(String[] args) {
		ConstructorIntro obj=new ConstructorIntro();
		System.out.println("Code after constructor");
		obj.hello();
		
	}
	
	void hello() {
		System.out.println("Hello class");
	}

}
