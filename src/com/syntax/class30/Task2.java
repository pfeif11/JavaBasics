package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Task2 {
//	Create a map of Best Buy store. Place
//	item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//
//	Retrieve all keys and values from a Best Buy map using EntrySet.
	
	public static void main(String[] args) {
		Map<Integer, String> items=new HashMap<>();
			items.put(12345, "32 inch TV Samsung");
			items.put(11123,"Toaster");
			items.put(45678, "LG Refrigerator");
			items.put(56948, "Apple iPhone7");
			
			
			Set<Entry<Integer,String>> entries=items.entrySet();
			Iterator<Entry<Integer,String>> it=entries.iterator();
			while(it.hasNext()) {
				Entry<Integer, String> print=it.next();
				System.out.println(print.getKey()+":"+print.getValue());
			}
	}

}
