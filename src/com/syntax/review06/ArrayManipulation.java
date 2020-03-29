package com.syntax.review06;

public class ArrayManipulation {
	public int largestNumber(int[] array) {
		int largest=array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]>largest) {
				largest=array[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) {
		
		int[] array= {5,2,9,6,1,8};
		ArrayManipulation manip=new ArrayManipulation();
		System.out.println("largest number is " +manip.largestNumber(array));
		
	}

	
	}

