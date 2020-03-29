package com.syntax.review06;

public class World {
	public static void main(String[] args) {
		Baby baby1=new Baby(); //created the baby
		System.out.println(baby1.cry());
		
		//assign value
		baby1.firstName="John";
		baby1.lastName="Smith";
		baby1.gender='M';
		baby1.weight=7;
		baby1.hairColor="Yellow";
		
		//reassign value
		baby1.weight=8;
		
		System.out.println("baby 1 first name is "+baby1.firstName);
		String babyLastName=baby1.lastName;
		System.out.println("baby last name is " +babyLastName);
		baby1.talk(3);
		System.out.println();
		System.out.println("-------Done with baby1-----------");
		
		
		Baby baby2=new Baby();
		
		System.out.println(baby2.cry());
		baby2.firstName="Selin";
		baby2.lastName="Atasoy";
		baby2.gender='F';
		baby2.hairColor="black";
		baby2.weight=6;
		baby2.displayBabyInfo();
		
	}

}
