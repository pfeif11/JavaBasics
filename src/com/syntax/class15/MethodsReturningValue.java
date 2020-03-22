package com.syntax.class15;

public class MethodsReturningValue {
	public static void main(String[] args) {
		//create a String and based on the length of the String
		//we define whether String is short or long 
		
		String str="Hello my friend";
		int length=str.length();
		
		if(length>10) {
			System.out.println("String is long");
		}
		else {
			System.out.println("String is short");
		}
		//compare 2 numbers and then we will identify whether largest number is even or odd
		Larger obj=new Larger();
		//int num=obj.l(10,20);
		MethodsReturningValue newObject=new MethodsReturningValue();
		newObject.largest(12, 13);
		
	}
	
	//create a method that returns largest number from 2 given numbers
	int largest (int a, int b) {
		int largest;
		if(a>b) {
			largest=a;
		}
		else {
			largest=b;
		}
		return largest;
	}

}
