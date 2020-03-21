package com.syntax.review05;

public class TwoDArrays {
	public static void main(String[] args) {
		int[][] numbers = new int[3][4];
		
		// default valut is zero
		// defualt value for String is null
		// Let's print third element in second row
		System.out.println(numbers[1][2]);
		// let initialize elements in the second row
		numbers[1][0] = 9;
		numbers[1][1] = 6;
		numbers[1][2] = 2;
		numbers[1][3] = 8;

		for (int x = 0; x < 4; x++) {
			System.out.println(numbers[1][x]);

			

		}
		// 2nd way
					int[][] numbers2 = { { 9, 6, 2, 8 }, 
							{ 7, 1, 6, 12 ,4,9,10}, 
							{ 3, 0, 8, 5 } };
		
		// Let's print 4th element in 1st row
				System.out.println(numbers2[0][3]);
				int row=numbers2.length;
				System.out.println("rows = "+row);
				int length0=numbers2[0].length; //length of first row
				int length1=numbers2[1].length;//length of second row
				int length2=numbers2[2].length;//length of 3rd row
				System.out.println(length1);
	//3rd way
			int[][] numbers3=new int[3][];
			numbers3[0]=new int[4]; //the first row has 4 elements
			numbers3[1]=new int[6];//second row has 6 elements
			numbers3[2]=new int[5];
	}

}
