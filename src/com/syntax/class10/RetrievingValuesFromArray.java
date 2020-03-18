package com.syntax.class10;

public class RetrievingValuesFromArray {
	public static void main(String[]args) {
		String[][] month= {{"January","February","December"},
							{"March","April","May"},
							{"June","July","August"},
							{"September","October","November"}
				
		};
		int rows=month.length;//how many arrays, number of rows
		int firstArray=month[0].length; //how many values in first array
		System.out.println(firstArray);
		
		for(int i=0;i<month.length;i++) { //iterates over rows
			for(int j=0;j<month[i].length;j++) {//iterates over columns
				System.out.print(month[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
