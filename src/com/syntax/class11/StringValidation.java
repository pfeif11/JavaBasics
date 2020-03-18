package com.syntax.class11;

public class StringValidation {
	public static void main(String[] args) {
		
		String str1="Welcome Syntax students";
		
		String str2="Welcome Syntax Students ";
		
		//to compare two Strings
		System.out.println("--------equals()  equalsIgnoreCase() Function -----------");
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home - Syntax Technologies";
		String actual="Home - Syntax Technologies ";
		//
		if(actual.equals(expected)) {
			System.out.println("Test case passed. Titles are matched");
		}
		else {
			System.out.println("Fail. Titles do not match");
		}
		
		if(actual.trim().equals(expected)) {
			System.out.println("Test case passed. Titles are matched");
		}
		else {
			System.out.println("Test case fails. Titles do not match");
		}
		
		String browser="Chrome";
		if(browser.equalsIgnoreCase("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
		//OR
		
		if(browser.toLowerCase().equals("chrome")) {
			System.out.println("Test executed on chrome browser");
		}
	}
	

}
