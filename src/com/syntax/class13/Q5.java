package com.syntax.class13;

public class Q5 {
	public static void main(String[] args) {
		//Reverse string character by character
		
		String given="I love Java so much";
		String reverse="";
		
		for(int i=given.length()-1;i>=0;i--) {
			reverse=reverse+given.charAt(i);
			
		}
		System.out.println(reverse);
		
		//reverse word by word
		
		String[] array=given.split(" ");
		String reverseWords="";
		
		for(int i=array.length-1;i>=0;i--) {
			reverseWords=reverseWords+array[i]+" ";
			
		}
		System.out.println(reverseWords);
	}

}
