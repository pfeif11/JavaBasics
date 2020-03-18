package com.syntax.repls;

import java.util.Scanner;

public class Repl77Again {
	public static void main(String[] args) {
//		Create an array of integers that will store 5 elements taken from a user
//		Don't print any prompt message for the user
//		Then print out all the elements you have created in the first loop in reverse order. 
		Scanner scan=new Scanner(System.in);
		
		int[] elements=new int[5];
		
		for(int x=0;x<5;x++) {

			int numbers=scan.nextInt();
			elements[x]=numbers;
		}
		for(int y=4;y>=0;y--) {
			System.out.println(elements[y]);
		}

	}

}
