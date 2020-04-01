package com.syntax.class20;

public class Employee {
	static String company="Syntax";
	int empNumber;
	double salary;
	
	void getPaid() {
		System.out.println("This employee at with ID number "+empNumber+" at "+company+" earns a salary of "+salary);
	}
	
	static void work() {
		System.out.println("Employee works at "+company);
	}

}
