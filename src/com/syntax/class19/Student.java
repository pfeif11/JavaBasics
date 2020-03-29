package com.syntax.class19;

public class Student {
	
	String name, address;
	
	public Student(String name, String address) {
		this.name=name;
		this.address=address;
	}
	
	public void displayInfo() {
		System.out.println("Name: "+name);
		System.out.println("Address: "+address);
	}
	
	public static void main(String[] args) {
		
		Student student1=new Student("Tina","5300 Holmes Run Pkwy");
		student1.displayInfo();
	}

}
