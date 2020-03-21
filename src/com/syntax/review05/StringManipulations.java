package com.syntax.review05;

public class StringManipulations {
	public static void main(String[] args) {
		String str = "Hello Syntax Friends";
		
		int length=str.length();
		System.out.println(length);
		System.out.println(str.toUpperCase());
		System.out.println(str); //str has not changed
		System.out.println(str.toLowerCase());
		
		System.out.println(str.replace("Hello", "Welcome"));
		 
		
	}

}
