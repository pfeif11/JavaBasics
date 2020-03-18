package com.syntax.repls;

public class Repl83 {
	public static void main(String[] args) {
		
		{
			int[][] a = {
				{1,1,2}, //sum = 4
				{3,1,2}, //sum = 6
				{3,5,3}, //sum = 11
				{0,1,2}  //sum = 3
			};


		int sums[] = new int[a.length];
		
			for (int i = 0; i < a.length; i++) {
				int rowSum = 0;
				for (int j = 0; j < a[i].length; j++) {
					rowSum += a[i][j];
				}
				sums[i] = rowSum;
			}

		for(int sum : sums) {
				System.out.println(sum);
	  }
	  
	}
	}
}


