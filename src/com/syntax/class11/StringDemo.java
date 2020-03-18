package com.syntax.class11;

public class StringDemo {
	public static void main(String[] args) {
		String school = " Syntax ";
		
		String str = new String("HELLO");
		
		String str1="This is a String 7676$^$";
		//how many characters String has, includes spaces
		
		System.out.println(school.length());

		int size=str.length();
		System.out.println("String length is "+size);
		
		//convert String to lowercase or uppercase
		
		System.out.println(school.toUpperCase());
		System.out.println(str.toLowerCase());
		str=str.toLowerCase();
		System.out.println(str);
		System.out.println("-------------CONCAT FUNCTION----------");
		//concatinate 2 Strings
		String newString=str+school;
		System.out.println(newString);
		
		String day="Saturday";
		String date="14";
		
		String newDate=day.concat(date);
		System.out.println(newDate);
		
		char grade='A';
		String strs="Student";
		//below code will give compiler error, 
		//since concat() method is use to attach 1 String to another String
		//str2.concat(grade);
		
		System.out.println("------isEmpty FUNCTION------");
		String str3="";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		System.out.println("-------trim() FUNCTION-----------");
		
		String str4="     Welcome to Syntax!    ";
		//trims empty spaces in the beginning and the end (not the middle)
		str4=str4.trim();
		System.out.println(str4);
		
	
	}

}
