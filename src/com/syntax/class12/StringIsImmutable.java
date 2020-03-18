package com.syntax.class12;

public class StringIsImmutable {
	public static void main(String[] args) {
		
		String str="Hello";
		String str1="Hello";
		String str2="World";
		
		str=str.concat(str2);
		System.out.println(str);
		
	}

}
