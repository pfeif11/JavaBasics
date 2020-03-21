package com.syntax.review05;

public class Task1 {
	public static void main(String[] args) {
		//find the min and max in a 2D array
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		
		int max=0;
		int min=0;
		int sum=0;
		for(int x=0;x<num.length;x++) {
			for(int y=0;y<num[x].length;y++) {
				sum=sum+num[x][y];
				if(num[x][y]>max) {
					max=num[x][y];
					
					
				}
				if(num[x][y]<min) {
					min=num[x][y];
				}
			}
		}
		System.out.println("The biggest number is "+max);
		System.out.println("The smallest number is "+min);
		System.out.println("The sum is "+sum);
	}

}
