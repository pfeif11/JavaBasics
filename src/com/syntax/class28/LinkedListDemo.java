package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList<String> llist=new LinkedList<>();
	
		llist.add("Yunus"); //comes from collection
		llist.add(0,"Reyhan"); //comes from List
		llist.add("Pavel");
		llist.add("Farid");
		llist.add("Farid");
		llist.add("Farid");
		
		int size=llist.size();
		System.out.println(size);
		
		//get all elements 1 by 1
		
		System.out.println("------for loop---------");
		for(int i=0;i<llist.size();i++) {
			System.out.println(llist.get(i));
		}
		
		System.out.println("---------enhance for loop----------");
		for(String names:llist) {
			System.out.println(names);
		}
		
		System.out.println("---------iteration--------");
		Iterator<String> nm=llist.iterator();
		while(nm.hasNext()){
			String element=nm.next();
			System.out.println(element);
			
			
		}
		
		//can we store objects of user defined classes?
	
		LinkedList<Food> food=new LinkedList<>();
		food.add(new Salad("salad", "tomato and cucumber", 100));
		food.add(new Dessert("dessert","chocolate",1000));
		food.add(new MainDish("pasta","mushrooms",800));
		
		for(Food f:food) {
			f.calories();
			f.foodType();
			f.ingredient();
			System.out.println("---------------");
		}
	}

}
