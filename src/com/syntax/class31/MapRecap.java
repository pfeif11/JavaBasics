package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {
	public static void main(String[] args) {
		//let's create hashmap of countries and capitals
		Map<String,String> hmap=new HashMap<>();
		hmap.put("USA", "Washington DC");
		hmap.put("Russia", "Moscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikistan", "Dushanbe");
		hmap.put("Italy",null);
		hmap.put(null,"some value");
		hmap.put(null,"another value"); //no duplicate keys
		System.out.println(hmap);
		//how to get all keys from a map? keySet(), entrySet()
		Set<String>keys=hmap.keySet(); //use loop or iterator
		
		Iterator<String> it=keys.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());//printing keys
		}
		System.out.println("------Getting both key and value---------");
		Set<Entry<String,String>>es=hmap.entrySet();
		Iterator<Entry<String,String>> entry=es.iterator();
		while(entry.hasNext()) {
			Entry<String,String> en=entry.next();
			String myEntry=en.getKey()+"--"+en.getValue();
			System.out.println(myEntry);
			
//			String key=entry.next().getKey();
//			System.out.println(key);


		}
		System.out.println("---------------");
		//how to get only values from a map? values(); entrySet();
		Collection<String> values=hmap.values();
		it=values.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//let's create hashtable of countries and capitals
		//hash table is legacy 
		Map<String,String> htable=new Hashtable<>();
		htable.put("USA", "Washington DC");
		htable.put("Russia", "Moscow");
		htable.put("France", "Paris");
		htable.put("Tajikistan", "Dushanbe");
		//htable.put("Italy", null); // does not allow null (NullPointerException)
		//htable.put(null,"some value"); //does not allow null, NullPointerException
		System.out.println(htable);
		
		//first part of the code
		createMap("City","Chantilly");
		createMap("City","Washington DC");
	}
	
	public static Map<String,String> createMap(String key, String value){
		Map map=new HashMap<>();
		map.put(key,value);
		return map;
	}

}
