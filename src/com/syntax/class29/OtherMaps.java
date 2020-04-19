package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {
	
	public static void main(String[] args) {
		//store student ID and student name
		Map<Integer,String> lmap=new LinkedHashMap<>();
		lmap.put(1000, "John Smith");
		lmap.put(1001, "Jane Smith");
		lmap.put(1002, "Faisal Sakhi");
		lmap.put(102, "Ali Tarlaci");
		
		System.out.println(lmap);
		System.out.println("--------------------------");
		
		//store object in a form of K and V and you 
		//want to sort your keys in Ascending order 
		//SORTING THE KEYS!
	Map<Integer,String> tmap=new TreeMap<>();
	
	tmap.put(1000, "John Smith");
	tmap.put(1001, "Jane Smith");
	tmap.put(1002, "Faisal Sakhi");
	tmap.put(102, "Ali Tarlaci");
	System.out.println(tmap);
	System.out.println("----------------------------");
	//create a map of COuntry and population and sort countries in Alphabetical order
	
	Map<String, Integer> population=new TreeMap<>();
	population.put("USA", 330000000);
	population.put("Kazakstan", 18000000);
	population.put("India", 1326000000);
	population.put("Afganistan", 37000000);
	
	System.out.println(population);
	
	
	}

}


