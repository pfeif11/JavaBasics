package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Questions {
	
	public static void main(String[] args) {
		//how to remove duplicates from ArrayList
		List<String> aList=new ArrayList<>();
		aList.add("John");
		aList.add("Jane");
		aList.add("James");
		aList.add("Jasmine");
		aList.add("Jane");
		aList.add("James");
		
		Set<String> set=new LinkedHashSet<>();
		set.addAll(aList);
		System.out.println(set);
		set.add("Alijon");
		set.add("Usman");
		//how to get only 1 value from set?
		if(set.contains("Jasmine")) {
			System.out.println("We have Jasmine");
		}
		
		List<String> list=new ArrayList<>(set);
		System.out.println(list);
		System.out.println(list.get(4));
		
		//2 convert to array
		Object[] array=set.toArray();
		System.out.println(array[5]);
		//Arrays is a utility class that has methods to work with array
		Arrays.sort(array);
		
		//to sort elements of any collection
		//collection is a utility class that has methods to work with collections
		Collections.sort(list);
		System.out.println(list);
		
		
		
		
		
	}

}
