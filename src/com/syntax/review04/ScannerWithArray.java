package com.syntax.review04;

import java.util.Scanner;

public class ScannerWithArray {
	public static void main(String[] args) {
		Scanner shasta=new Scanner(System.in);
		System.out.println("How many elements do you want, buddy?");
		int size=shasta.nextInt();
		System.out.println(size);
		//I am creating an array with size=whatever she gave us
		int[] nums=new int[size];
		//This for loop inserts numbers into the array
		for(int i=0;i<size;i++) {
			System.out.println("Give me a number to store in the array");
			int number=shasta.nextInt();
			nums[i]= number;
			//or nums[i]=scan.nextInt();
		}
		
		System.out.println("Let me see what you gave me:");
		//This enhance for loops reads numbers from the array
		for(int n:nums) {
			System.out.println(n);
		}
	}

}
