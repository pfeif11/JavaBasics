package com.syntax.class14;

public class Dog {
	
	
	String breed;
	String color;
	int age;
	String size;
	String name;
	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		dog1.breed="German Shepherd";
		dog1.color="Black";
		dog1.age=7;
		dog1.size="Large";
		dog1.name="Shasta";
		
		dog1.bark();
		dog1.eat();
		dog1.run();
		
		Dog dog2= new Dog();
		dog2.breed="Labrador";
		dog2.color="Black";
		dog2.age=5;
		dog2.size="Medium";
		dog2.name="Kini";
		dog2.bark();
		dog2.eat();
		dog2.run();
		
		System.out.println("My favorite dog is a "+dog1.breed);
				
		
	}
	void eat() {
		System.out.println(name+" can eat");
	}
	void bark() {
		System.out.println(name+" can bark");
	}
	void run() {
		System.out.println(name+ " can run");
	}
	

}
