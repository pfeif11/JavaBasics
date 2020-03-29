package com.syntax.class17;

public class Task {
//add numbers from an array
	int add(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		Task x = new Task();
		int[] array1 = { 5, 2, 3, 10 };
		System.out.println(x.add(array1));
		

	}

}
