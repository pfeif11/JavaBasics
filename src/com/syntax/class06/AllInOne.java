package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {

		Scanner shasta = new Scanner(System.in);

		System.out.println("Is there a sale going on? Yes or No");
		String sale = shasta.nextLine();
		double finalPrice;
		double discount;
		double price;

		if (sale.equalsIgnoreCase("Yes")) {
			System.out.println("What is the price?");

			price = shasta.nextDouble();

			if (price > 0 && price < 20) {
				discount = .1 * price;

			} else if (price >= 20 && price < 100) {
				discount = .2 * price;

			} else if (price >= 100 && price <= 500) {
				discount = .3 * price;

			} else {
				discount = .5 * price;

			}
			finalPrice = price - discount;
			System.out.println("Atfer discount of " + discount + " the price of the item reduced from " + price + " to "
					+ finalPrice);

		} else {
			System.out.println("We are not going shopping");
		}

	}

}
