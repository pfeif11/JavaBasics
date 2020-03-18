package com.syntax.class05;

import java.util.Scanner;

public class NextvsNextLn {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		
		System.out.println("Please enter any text");
		String text=scan.next();
		
		String text2=scan.nextLine();
		System.out.println("Please enter any text");
		String text1=scan.nextLine();
		
		System.out.println(text);
		System.out.println(text1);
		
	}

}
