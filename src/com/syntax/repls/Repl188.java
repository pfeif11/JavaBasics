package com.syntax.repls;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
public class Repl188 {
	

	
		public static void main(String[] args) {

			List<String> countries = new LinkedList<>();
			countries.add("Armenia");
			countries.add("USA");
			countries.add("Kazakhstan");
			countries.add("Australia");
			countries.add("Pakistan");
			countries.add("Russia");
			countries.add("Azerbaijan");
			
			Iterator<String> c=countries.iterator();
			while(c.hasNext()) {
			  
			  String a=c.next();
			 if(a.startsWith("A")) {
			   c.remove();
			 }
			}
			
			
			
			
		}
	}


