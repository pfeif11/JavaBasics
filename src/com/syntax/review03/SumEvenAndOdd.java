package com.syntax.review03;

public class SumEvenAndOdd {
	public static void main(String[] args) {
		// 1 &&50
		int a = 1;
		int totalOdd = 0;
		int totalEven = 0;

		while (a <= 50) {
			if (a % 2 == 0) {
				totalEven = totalEven + a;

			} else {
				totalOdd = totalOdd + a;

			}
			a++;

		}
		System.out.println("total even:"+totalEven);
		System.out.println("total Odd:"+ totalOdd);

	}

}
