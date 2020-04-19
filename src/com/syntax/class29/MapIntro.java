package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
	
	public static void main(String[] args) {
		//hasMap is not maintaining order (hashMap is fast)
		Map<String,String>hmap=new HashMap<>();
		//to store value into Map, we use put method
		
		hmap.put("Name", "John");
		hmap.put("Last Name", "Smith");
		hmap.put("Address","123 Test");
		hmap.put("City", "Chantilly");
		
		//how to check if map has any values?
		System.out.println("Map is empty:"+hmap.isEmpty());
		
		//how many elements in Map, gives you the number of entries
		int size=hmap.size();
		System.out.println("Map size is="+size);
		
		//can we add more values? yes
		hmap.put("Zip", "12345");
		
		//can we store duplicate keys? NO, previous value will be replaced
		hmap.put("Name","Jane"); //Jane replaced John
		System.out.println(hmap);
		//there is no order with HashMap
		
		//how to access value? put it the key
		System.out.println(hmap.get("Name"));
		
		//to remove value
		hmap.remove("Address");
		System.out.println(hmap);
		
		//replace value in map
		hmap.replace("Zip","98765");
		System.out.println(hmap);
		
		
		
		
	}

}
