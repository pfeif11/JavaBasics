package com.syntax.class12;

public class InterviewQ1 {
//	Write a program to swap 2 numbers without a temporary variable
//	Swap  2 strings without a temporary variable
	public static void main(String[] args) {
		
		int x=20;
		int y=2;
		
		
		x=x+y;//22=20+2
		
		y=x-y; //20=22-2
		
		x=x-y; //
		System.out.println("Value of x="+x);
		System.out.println("Value of y="+y);
		
		String word="Happy Birthday";
		String word2="I really like pie";
		int wordLength=word.length();
		
		
		
		word=word+" "+word2;
		word2=word.substring(0,(wordLength));
	
		word=word.substring(wordLength+1);
		System.out.println("Word 1 is now "+word);
		System.out.println("Word 2 is now "+word2);
		
		String str1="Day";
		String str2="Night";
		
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		
		System.out.println("String 2 is now "+str2);
		System.out.println("String 1 is now "+str1);
	}
	
}
