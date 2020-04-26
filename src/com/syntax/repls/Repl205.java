package com.syntax.repls;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Repl205 {

	public static void main (String[] args) {
	    
		   List <Map<String,Object>> dataList=new LinkedList<>();
		   Map<String,Object> appleMap=new LinkedHashMap<>();
		   
		   appleMap.put("Items","Apple");
		   appleMap.put("Price",20.00);
		   appleMap.put("Quantity",10);
		   dataList.add(appleMap);
		   
		   Map<String, Object> orangeMap=new LinkedHashMap<>();
		   orangeMap.put("Items","Orange");
		   orangeMap.put("Price",21.99);
		   orangeMap.put("Quantity",10);
		   
		   dataList.add(orangeMap);
		   
		   
		   
//		   Step 6: Create a loop from dataList. 
//		   Step 7: Retrieve each Key and store it in a variable. 
		   for(Map<String,Object> d:dataList) {
			   
			 //  System.out.println(d.));
		   }
		  }
}
