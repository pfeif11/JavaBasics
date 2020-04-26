package com.syntax.repls;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Repl199 {

	public static void main(String[] args) {
		Map<String, Integer> fruit=new HashMap<>();
		fruit.put("mango",10);
		fruit.put("apple", 30);
		
		Iterator<String> it=fruit.keySet().iterator();
		String key;
		while(it.hasNext()) {
			key=it.next();
			System.out.println(key+" "+fruit.get(key));
		}
	}
}


