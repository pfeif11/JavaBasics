package com.syntax.class13;

public class Q4 {
	public static void main(String[] args) {
		//how many aplha characters
		String str="aaaa22233333*****$**$*$";
		
		str=str.replaceAll("[^A-Za-z]", "");
		int length=str.length();
		System.out.println("Number of Alpha characters="+length);
		
		//how many words
		
		String myString="Today is Wednesday";
		String[] sentence=myString.split(" ");
		
		System.out.println("Total words in string:"+sentence.length);
	}

}
