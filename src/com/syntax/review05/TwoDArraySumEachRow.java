package com.syntax.review05;

public class TwoDArraySumEachRow {
	public static void main(String[] args) {
		int[][] num = { { 7, 1, 6, 12 }, { 9, 6, 2, 8 }, { 3, 0, 8, 5 } };
		
		int[]sum= new int[num.length];
		for(int[] row:num) {
			for(int element:row) {
				
			}
		}
		for(int row=0;row<num.length;row++) {
			for (int col=0;col <num[row].length;col++) {
				int element=num[row][col];
				sum[row]=sum[row]+element;
				
			}
		}
		//let iterate the sum array
		for(int element:sum) {
			System.out.println("Sum is "+element);
		}
	}

}
