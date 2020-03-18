package com.syntax.class12;

import java.util.Scanner;

public class InterviewQ4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//-------------- Find out how many alpha characters are present in a String?  Find number of words in string? ------------------
			System.out.println("Please enter a text: ");
			String text = scan.nextLine();
			String alpha = text.replaceAll("[^A-Za-z]", "");
			System.out.println(alpha);
			System.out.println(alpha.length());
			String [] words = text.replaceAll("[^A-Za-z\\s]", "").split(" ");
			System.out.println(words.length);
			
	}

	}


