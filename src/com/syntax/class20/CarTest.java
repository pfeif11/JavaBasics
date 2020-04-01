package com.syntax.class20;

public class CarTest {
	
	public static void main(String[] args) {
		Car car=new Car();
		System.out.println("---------------");
		Mercedes merc=new Mercedes("Mercedes","SLC","AMG");
		
		merc.display();
		Mercedes merc1=new Mercedes("Mercedes","S","NO AMG");
		merc1.display();
		
		Mercedes merc2=new Mercedes("Mercedes","S","AMG");
	}
}
