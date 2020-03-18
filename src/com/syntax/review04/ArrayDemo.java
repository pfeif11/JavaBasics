package com.syntax.review04;

public class ArrayDemo {
	public static void main(String[] args) {
		// silly way
		int a0 = 5;
		int a1 = 7;
		int a2 = 8;
		int a3 = 9;
		int a4 = 20;
//		System.out.println(a0);
//		System.out.println(a1);
//		System.out.println(a2);
//		System.out.println(a3);
//		System.out.println(a4);

		// 1st professional way
		// arrays store the same data types and they have a fixed size
		// declaring an array, all elements have default value

		int[] numbers = new int[5];
		// assigning values for array elements
		numbers[3] = 9;
		numbers[2] = 8;
		numbers[1] = 7;
		numbers[0] = 5;
		numbers[4] = 20;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(numbers[3]);
		System.out.println(numbers[4]);
		// printing the element with index 2 (3rd element)
		int i = 2;
		System.out.println(numbers[i]);
		i++;
		System.out.println(numbers[i]);
		// a method using for loop
		// this method can iterate from start point to end point
		int arrayLength = numbers.length;
		System.out.println("Reading from array using for loop");
		for (int j = 0; j < numbers.length; j++) {
			System.out.println(numbers[j]);
		}
		// method b using for-each/advanced/enhanced for loop
		// this methods iterates the whole array
		System.out.println("for each loop");
		for (int number : numbers) {
			System.out.println(number);

			// 2nd professional way
			System.out.println("Second way using curly brackets");
			int[] numbers2 = { 4, 6, 8, 9, 15 };
			System.out.println("Size is "+numbers.length);
			
			for(int j=0; j<numbers2.length;j++) {
				System.out.println(numbers2[j]);
			}
			System.out.println("Enhanced For Loop");
			for(int numberss:numbers2) {
				System.out.println(numberss);
			}
		}

	}

}
