package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Tasks {
//	Create an arraylist of cars 
	//and retrieve all the values 
	//using 3 different ways.
//

	
	public static void main(String[] args) {
	ArrayList<String> cars=new ArrayList<>();
	
	cars.add("Jetta");
	cars.add("Mazda 2");
	cars.add("Civic");
	cars.add("BMW 325i");
	System.out.println("------Using enhanced for loop------------");
	for(String c:cars) {
		System.out.print(c+" ");
	}
	System.out.println("");
	System.out.println("-------Using for loop---------");
	for(int i=0;i<cars.size();i++) {
		System.out.print(cars.get(i)+" ");
	}
	System.out.println("");
	System.out.println("----------Using iteration-------");
	
	Iterator<String> cr=cars.iterator();
	while(cr.hasNext()) {
		String element=cr.next();
		System.out.print(element+" ");
	}
	}

}
