package com.syntax.class16;

public class Dog {
	
	String name, size;
	int age;
	
	static String breed="Husky";
	static int paws=4;
	static int tail=1;
	static int eyes=2;
	void displayDog() {
		System.out.println("Dog name is "+name+" and it is "+size+" and age is "+age);
		System.out.println("Dog breed is "+breed+ " and it has "+paws+" paws and "+tail+" tail");
	}
	
	public static void main(String[] args) {
		Dog dog1=new Dog();
		//how to access instance variables? by creating an object and using reference variable
		dog1.name="Lucy";
		dog1.size="Big";
		dog1.age=5;
		dog1.age=6;
		dog1.displayDog();
		
		System.out.println("Dog 1 name is "+dog1.name);
		//how to access static variables - they belong to the class and accessed by class name
		System.out.println(Dog.breed);
		System.out.println(Dog.paws);
		System.out.println(dog1.breed);
		
		Dog dog2=new Dog();
		dog2.name="Sharik";
		dog2.size="Small";
		dog2.age=2;
		System.out.println("Dog 2 name is "+dog2.name);
		dog2.displayDog();
		
		Dog dog3=new Dog();
		dog3.name="Pepsi";
		dog3.size="Big";
		dog3.age=10;
		dog3.displayDog();
	}

}
