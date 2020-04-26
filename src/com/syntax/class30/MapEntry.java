package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEntry {
	
	public static void main(String[] args) {
		//create a map that will store month and days in a month
		Map<String,Integer> month=new LinkedHashMap<>();
		
		month.put("January",31);
		month.put("February",28);
		month.put("March", 31);
		month.put("April", 30);
		
		System.out.println(month.size());//gives numbers of entries
		
		//get all entries from the map
		Set<Entry<String,Integer>>entries=month.entrySet();
		// loop through all entry objects
		
		for(Entry<String,Integer>e:entries) {
			System.out.println(e.getKey()+":"+e.getValue());
		}
		
		//iterator
		System.out.println("---------------------------------");
		Iterator<Entry<String,Integer>> it=entries.iterator();
		while(it.hasNext()) {
			Entry<String, Integer> entry=it.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		
	}
	

}
