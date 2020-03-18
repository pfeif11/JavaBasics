package com.syntax.class12;

public class InterviewQ5 {
	public static void main(String[] args) {
		//Write a java program to reverse String? Reverse a string word by word?
		String word="RedPineapple";
		
		for(int x=word.length()-1;x>=0;x--) {
			System.out.print(word.charAt(x));
		}
		System.out.println();
		
		String sentence="I love my dog Shasta";
		String []words=sentence.split(" ");
		System.out.println("The number of words is "+words.length);

	}

	}


