package com.syntax.class10;

public class RetrieveElements {
	public static void main(String[] args) {
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
		//Then print a grade B (use 2 different ways of creating an array).
		
		char[] grade=new char[6];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		
		System.out.println(grade[1]);
		System.out.println("-------------------");
		
		char[] grade2={'A','B','C','D','E','F'};
		
	//getting all elements
		for(int i=0;i<grade2.length;i++) {
			System.out.println(grade2[i]);
		}
		
		System.out.println("------------Printing using advanced for loop-------");
		
		for(char grades:grade2) {
			System.out.println("grade "+grades);
		}
		
		System.out.println("---------------------------------------");
		//creating an array of fruit and retrieve all elements
		String[] fruits= {"Banana","Kiwi","Apple","Mango"};
		
		for(String a:fruits) {
			if(a.equals("Apple")) {
				System.out.println(a+" is your favorite fruit");
			}
			else {
				System.out.println(a);
			}
			
		}
		System.out.println("----------------------");
		for(int i=0;i<fruits.length;i++) {
			
			System.out.println(fruits[i]);
		}
	
	}

}
