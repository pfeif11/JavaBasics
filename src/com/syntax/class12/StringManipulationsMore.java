package com.syntax.class12;

public class StringManipulationsMore {
	//to get substring from a given String
	//substring=String inside your String
	public static void main(String[] args) {
		System.out.println("-----------substring() FUNCTION -------------");
		
		String str="Today is a rainy day";
		//rainy day
		String partialString=str.substring(11);
		System.out.println(partialString);
		
		//Today
		partialString=str.substring(0, 5);
		System.out.println(partialString);
		//rainy
		partialString=str.substring(11,16);
		System.out.println(partialString);
	}

}
