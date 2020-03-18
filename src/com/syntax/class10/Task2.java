package com.syntax.class10;

public class Task2 {
	public static void main(String[] args) {
		//Create an array on integers and calculate 
		//the sum of all integer elements in an array.
		int sum=0;
		int integers[]= {1,4,5,6,10,11,28,200};
		for(int x=0;x<integers.length;x++) {
			sum=sum+integers[x];
		}
		System.out.println(sum);
		
		System.out.println("---------------------------");
		
		int [] numbers = {27,43,87,322,6,32,65,85,54,7};
		int sum2=0;
		for (int i:numbers){
			sum2=sum2+i;
		}
		System.out.println("The sum of the numbers in this array is :"+ sum);
		
		
		
	}

}
