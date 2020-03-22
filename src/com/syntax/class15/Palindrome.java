package com.syntax.class15;

public class Palindrome {
	
	void isPalindrome(String word) {
		String reverse="";
		for(int i=word.length()-1;i>=0;i--) {
			reverse=reverse+word.charAt(i);
		}
		System.out.println(reverse);
		if(word.equalsIgnoreCase(reverse)) {
			System.out.println(word+ " is a palindrome");
		}
		else {
			System.out.println(word+" is not a palindrome");
		}
	}
	
	public static void main(String[] args) {
		Palindrome word1=new Palindrome();
		word1.isPalindrome("Madame");
		
	}

}
