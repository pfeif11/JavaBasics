package com.syntax.class10;

public class Recap {
	public static void main(String[] args) {
		
		int[] grades=new int[4];
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		int average=(grades[0]+grades[1]+grades[3]+grades[2])/4;
		System.out.println("Average grade is "+average);
		System.out.println("------------------");
		
		String[] city= {"Washington D.C.","New York","Paris","Miami","Los Angeles","Dallas","Chantilly"};
		
		System.out.println("I live in "+city[2]);
		
		int x=1;
		System.out.println(city[x]);
		x+=3;
		System.out.println("I moved to "+city[x]);
		//how many elements stored inside the array
		int arraySize=city.length;
		System.out.println("Total elements "+arraySize);
		//how can we access last element from an array
		
		System.out.println(city[arraySize-1]);
		//access all elements in an array
		
		for(int i=0;i<arraySize;i++) {
			System.out.println(city[i]);
		}
		
	}

}
