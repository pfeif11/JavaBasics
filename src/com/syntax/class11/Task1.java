package com.syntax.class11;

public class Task1 {
	public static void main(String[] args) {
		String[][] cars= {
				{"Ford","Chevy","Buick"},
				{"BMW","Mercedes","Audi"},
				{"Kia","Hyundai"},
				{"Ferrari","Fiat"}
		};
		
		for(int x=0;x<cars.length;x++) {
			for(int y=0;y<cars[x].length;y++) {
				System.out.print(cars[x][y]+" ");
			}
			System.out.println();
		}
		System.out.println("------Using for Loop-----");
		for(String[] make:cars) {
			for(String m:make) {
				System.out.print(m+" ");
			}
			System.out.println();
		}
		
	}

}
