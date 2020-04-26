package com.syntax.review10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class WorldMap {
	public static void main(String[] args) {
		Map<String,String> europe=new HashMap<>();
		europe.put("France", "Paris");
		europe.put("Italy","Rome");
		europe.put("Germany","Berlin");
		System.out.println("Map:"+europe);
		
		Set<Entry<String,String>>entries=europe.entrySet();
		
		System.out.println("Set:"+entries);
		
		Map<String,String> africa=new HashMap<>();
		africa.put("Morocco", "Rabat");
		africa.put("Egypt","Cairo");
		africa.put("Tunisia","Tunis");
		System.out.println("Map:"+africa);
		//hw1 iterate europe by getting keys
		//hw2 iterate by getting entries
		
		Map<String,String> asia=new HashMap<>();
		asia.put("China", "Beijing");
		asia.put("Turkmenistan","Ashgabat");
		asia.put("Japan","Tokyo");
		System.out.println("Map:"+asia);
		System.out.println("-----world-------");
		List<Map<String,String>> world=new ArrayList<>();
		world.add(europe);
		world.add(africa);
		world.add(asia);
		System.out.println(world);
		
		for(Map<String,String>continentMap:world) {
			//System.out.println(continent);
			Set<String> countryNames=continentMap.keySet();
			for(String country:countryNames) {
				System.out.println(country+" "+continentMap.get(country));
			}
			System.out.println();
		}
		
		
	}

}
