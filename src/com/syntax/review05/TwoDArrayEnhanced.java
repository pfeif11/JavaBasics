package com.syntax.review05;

public class TwoDArrayEnhanced {
	public static void main(String[] args) {
		int[][] num = { { 9, 6, 2, 8 }, 
				{ 7, 1, 6, 12 ,4,9,10}, 
				{ 3, 0, 8, 5 } };
		//iterating rows
		for(int []row:num) {
			//interating elements of a row (col)
			for(int element:row) {
				System.out.print(element+" ");
			}
			System.out.println();
			
		}
	}

}
