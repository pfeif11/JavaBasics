package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {
	
	public static void main(String[] args) {
		//lets create a grocery map(item,quantity) in which we do not care about the order
		
		Map<String, Integer> grocery=new HashMap<>();
		grocery.put("milk",1);
		grocery.put("cucumber",3);
		grocery.put("banana",12);
		grocery.put("cheese",2);
		grocery.put("grapes",3);
		System.out.println(grocery);
		//create a map of items to buy(item, quantity) in which we want to preserve the order
		Map<String, Integer> household=new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitizer", 2);
		household.put("paper towel", 3);
		household.put("toilet paper", 10);
		household.put("face mask", 50);
		System.out.println(household);
		
		//create a map in which we store all previous items in ascending order
		Map<String, Integer> shopping=new TreeMap<>();
		shopping.putAll(grocery);
		shopping.putAll(household);
		System.out.println(shopping);
		
		//get all keys
		
		System.out.println(shopping.keySet());
		for(String s:shopping.keySet()) {
			System.out.println(s);
		}
		System.out.println("---------------");
		//get all keys using iterator
		Iterator<String> keys=shopping.keySet().iterator();
		while(keys.hasNext()) {
			System.out.println(keys.next());
		}
		
		//get all values
		for(int val:shopping.values()) {
			System.out.println("Value:"+val);
		}
		System.out.println("---------------------");
		//get all values using iterator
		
		Iterator<Integer> v=shopping.values().iterator();
		while(v.hasNext()) {
			System.out.println("Value:"+v.next());
		}
		
	}

}
