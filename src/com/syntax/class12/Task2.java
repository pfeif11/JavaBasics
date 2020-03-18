package com.syntax.class12;

import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		System.out.println("Please enter word");
		String word=shasta.nextLine();
		int size=word.length();
		char letters;
		if(size%2!=0) {
			int index=(size/2);
			letters=word.charAt(index);
			System.out.println(letters);
		}
		else {
			System.out.println("String is not an odd number of characters");
		}
	}

}
