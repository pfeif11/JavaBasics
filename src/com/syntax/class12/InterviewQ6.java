package com.syntax.class12;

public class InterviewQ6 {
	public static void main(String[] args) {
		
		String word="I am ma I";
		String reverse="";
		int size=word.length();
		for(int x=size-1;x>=0;x--) {
			reverse=reverse+word.charAt(x);
		}
		System.out.println(reverse);
		if(reverse.equalsIgnoreCase(word)) {
			System.out.println("This word is a palindrome");
		}
		else {
			System.out.println("This word is not a palindrome");
		}
	}

}
