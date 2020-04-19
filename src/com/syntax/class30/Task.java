package com.syntax.class30;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Task {
//	Create a map of countries with its capital that will store countries in alphabetical order.
//	Print all keys and values from a country map using for each loop and iterator.
//	Print all values from a country map using for each loop and iterator.
	
	public static void main (String[] args) {
		Map<String,String> countries=new TreeMap<>();
		countries.put("Philippines","Manila");
		countries.put("Poland", "Warsaw");
		countries.put("Portugal","Lisbon");
		countries.put("Vietnam","Hanoi");
		countries.put("Austria","Vienna");
		countries.put("Croatia","Zagreb");
		countries.put("Cambodia", "Phnom Penh");
		
		System.out.println(countries);
		System.out.println("---------Using for each loop------------");
		for(String c:countries.keySet()) {
			System.out.println(c);
		}
		System.out.println("-----------Using Iterator------------");
		Iterator<String> c=countries.keySet().iterator();
		while(c.hasNext()) {
			System.out.println(c.next());
		}
		System.out.println("------------------using for each loop-----------");
		for(String cap:countries.values()) {
			System.out.println(cap);
		}
		System.out.println("-----------Using Iterator------------");
		Iterator<String> cap=countries.values().iterator();
		while(cap.hasNext()) {
			System.out.println(cap.next());
			
		}
		//storing all entry objects into a set
		Set<Entry<String,String>> allEntries=countries.entrySet();
	System.out.println(allEntries);
	
	//loop through all entried to get key and value
	for(Entry<String,String> entr:allEntries) {
		System.out.println(entr.getKey()+":"+entr.getValue());
	}
	System.out.println("-----------ITERATOR---------");
	Iterator<Entry<String,String>> entryIterator=allEntries.iterator();
	while(entryIterator.hasNext()) {
		Entry<String,String> e=entryIterator.next();
		System.out.println(e.getKey()+":"+e.getValue());
	}
	}

}
