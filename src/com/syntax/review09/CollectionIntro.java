package com.syntax.review09;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionIntro {
	public static void main(String[] args) {
		//generic
		ArrayList<String> europe =new ArrayList<>();//empty arraylist
	
		ArrayList<String> asia=null;//we don't have an object yet
		System.out.println("Europe size is "+europe.size());
		System.out.println("Europe is empty: "+europe.isEmpty());
		europe.add("Albania");
		europe.add("France");
		europe.add("Spain");
		europe.add("Portugal");
		
		europe.add("Turkey");
		
		System.out.println("Europe size is "+europe.size());
		
		europe.remove("Turkey");
		
		System.out.println("Europe size is "+europe.size());
		
		System.out.println("Europe is empty: "+europe.isEmpty());
		
		System.out.println(europe);
		
		//System.out.println("After Corona");
		//europe.clear();
		
		System.out.println("------------------getting list via regular for loop----------------");
		for(int i=0;i<europe.size();i++) {
			System.out.println(europe.get(i));
		}
		
		System.out.println("------------get list via enhanced for loop----------");
		for(String countries:europe) {
			System.out.println(countries);
		}
		
		System.out.println("---------getting list via iterator---------");
		Iterator<String> it=europe.iterator();
//		it.next(); will return the next element from the collection
//		it.hasNext(); will return true/false
//		it.remove(); will remove the element while iterating
//		String country1=it.next();
//		String country2=it.next();
//		String country3=it.next();
//		String country4=it.next();
//		String country5=it.next();
////		//String country6=it.next();
////		System.out.println(country1+" " +country2+" "+country3);
//		System.out.println();
		
		while(it.hasNext()) {
			String country=it.next();
			System.out.println(country+" ");
		}
		
		
		
	
	}

}
