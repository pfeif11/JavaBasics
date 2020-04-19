package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	public static void main(String[] args) {
		
		//create a collection that will store only unique objects
		//and we do not care about the order
		
		HashSet<String> breakfast=new HashSet<>();
		
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("cream cheese");
		breakfast.add("eggs");
		breakfast.add("coffee");
		
		//how many elements in the set?
		
		System.out.println(breakfast.size()); //5 not 6 because there cannot be duplicate elements
	
		System.out.println(breakfast); //the second eggs do not show up because there cannot be duplicates
		//Also the order is not the maintained, we use HashSet if the order doesn't matter
		
		//retrieving an element --> no get method available!
		
		//we can retrieve all elements!
		
		Iterator<String> myIterator=breakfast.iterator();
		
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		
		//we cannot use for loop
		
		//advanced/enhanced for loop/for each loop
		System.out.println("-------------------------");
		for(String b:breakfast) {
			System.out.println(b);
		}
		
		
		
		
	}

}
