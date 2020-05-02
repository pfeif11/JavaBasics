package com.syntax.class33;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
//	Create a static method that will return a 
//	List of Exceptions. 
	//Inside your method create objects 
//	of 4 exception classes using try and catch blocks and 
//	store them inside your list.
//	Call your method inside main and print 
//	name and details of all Exception objects.
	public static void main(String[] args) {
		
	
List<Exception> exc=new ArrayList<>();
int a=4;
int b=0;

try {
	System.out.println(a/b);
} catch(Exception e) {
	System.out.println("ArithmeticException");
}
	
	}
}
