package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task2 {
public static void main(String[] args) {
	
//	Create an arrayList of words.
	//Remove every word that ends with “e”.
	//Use iterator
	
	ArrayList<String> words=new ArrayList<>();
	words.add("pineapple");
	words.add("apple");
	words.add("avocado");
	words.add("tomato");
	
	Iterator<String> fr=words.iterator();
	while(fr.hasNext()) {
		String element=fr.next();
		if(element.endsWith("e")) {
			fr.remove();
		}
		
	}
	System.out.println(words);

}
}
