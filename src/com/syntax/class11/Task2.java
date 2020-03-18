package com.syntax.class11;

public class Task2 {
	public static void main(String[] args) {
		String[][] countries= {
				{"Canada","Mexico","USA"},
				{"Colombia","Paraguay","Ecuador"},
				{"Poland","Austria","Portugal"},
				{"Philippines","Cambodia","Vietnam","Indonesia"},
				{"Morocco","South Africa","Namibia","Uganda","Eritrea"},
		};
		
		int elements=0;
		for(int x=0;x<countries.length;x++) {
			for(int y=0;y<countries[x].length;y++) {
				System.out.print(countries[x][y]+" ");
				elements++;
				
			}
			
			System.out.println();
			
			
		}
		System.out.println("Number of countries is " +elements);
		System.out.println("-------Using Advanced FOR Loop-------");
		int count=0;
		for(String[] world:countries) {
			for(String c:world) {
				System.out.print(c+" ");
				count++;
			}
			System.out.println();
		}
		System.out.println("Total "+count);
		
		
	}

}
