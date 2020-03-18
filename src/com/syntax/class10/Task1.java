package com.syntax.class10;

public class Task1 {
	public static void main(String[] args) {
		//Create an array of animals and store 6 elements into it. 
		//Using 2 different loops print all elements from the array.
		String []animals=new String[6];
		animals[0]="Tiger";
		animals[1]="Cow";
		animals[2]="Elephant";
		animals[3]="Dog";
		animals[4]="Fox";
		animals[5]="Cat";
		for(int i=0;i<animals.length;i++) {
			System.out.println(animals[i]);
			
		}
		System.out.println("--------------------------");
		
		for(String animal:animals) {
			System.out.println(animal);
		}
	}

}
