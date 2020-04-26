package com.syntax.review10;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIntro {
	public static void main(String[] args) {
		//List man wallet - duplicates
		//Set Women's purse - no duplicates
		Set<String> africa=new HashSet<>();
		africa.add("Tunisia");
		africa.add("Morocco");
		africa.add("Kenya");
		africa.add("Kenya"); //won't be added in the set because it already exists
		africa.add("Algeria");
		
		System.out.println("HashSet"+africa);
		//keeps order
		Set<String> africa2=new LinkedHashSet<>();
		africa2.add("Tunisia");
		africa2.add("Morocco");
		africa2.add("Kenya");
		africa2.add("Kenya"); //won't be added in the set because it already exists
		africa2.add("Algeria");
		
		System.out.println("LinkedHashSet"+africa2);
		//ascending order
		Set<String> africa3=new TreeSet<>(africa2);
		
		
		System.out.println("TreeSet"+africa3);
		africa3.remove("Algeria");
		boolean contains=africa3.contains("Kenya");
		boolean ableToRemove=africa3.remove("Algeria");
		//You are not able to remove by index because there is no index
		//for each loop
		for(String a:africa3) {
			System.out.println(a);
		}
		//cannot remove by for each loop
		
		System.out.println("-------Using iterator------");
		Iterator<String> it=africa3.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Array primitives and objects
		//Collections can only store objects 
		//List(more specific type of collection)- ArrayList, LinkedList
		//Set(more specific type of collection) - HashSet,LinkedHashSet, TreeSet
		
		//treeSet does not allow null
		//Collection Framework
		//Collections is a class
		System.out.println("----------------------");
		String minimum=Collections.min(africa3);
		System.out.println(minimum);
		
		
	}

}
