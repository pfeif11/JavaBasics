package com.syntax.repls;

import java.util.HashMap;
import java.util.Map;

public class Repl204 {
	public static void display(Map<String,Integer> map){
	    if(map.isEmpty()){
	      System.out.println("map is empty");
	    }
	    else{
	      for(String m:map.keySet()) {
	        System.out.println(m+" : "+map.get(m));
	      }
	    }
	  }
	  
	  
	  public static void main(String[ ] args) {
	    
	    Map<String, Integer> map=new HashMap<>();
	    map.put("mango",10);
	    map.put("apple",30);
	    map.put("orange",20);
	    
	   display(map);
	   map.clear();
	   display(map);
	   

	  }
}
