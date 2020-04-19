package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task {

	public static void main(String[] args) {
		// Create a Set collection in which you need to add names of the countries. In
		// this set we want all objects to be sorted in alphabetical order. Using 2
		// different ways retrieve all elements from set.

		Set<String> countries = new TreeSet<>();
		countries.add("Philippines");
		countries.add("Switzerland");
		countries.add("Poland");
		countries.add("Colombia");
		countries.add("Senegal");
		countries.add("Laos");

		System.out.println("Using for each loop");
		for (String c : countries) {
			System.out.print(c + " ");
		}
		System.out.println();
		System.out.println("Using Iterator");
		Iterator<String> it = countries.iterator();

		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
//		Create a Set of cities in which you want to make sure that insertion order is maintained. 
		//Using Iterator remove any city that starts with “A”;
		
		Set<String> cities=new LinkedHashSet<>();
		cities.add("Manila");
		cities.add("Atlantic City");
		cities.add("Marikina");
		cities.add("Funchal");
		cities.add("Ponta Delgada");
		cities.add("Ronvinj");
		cities.add("Split");
		cities.add("Adelaide");
		cities.add("Piran");
		
		Iterator<String> c=cities.iterator();
		
		while(c.hasNext()) {
			String obj=c.next();
			if(obj.startsWith("A")) {
				c.remove();
				
			}
			
		}
		for(String x:cities) {
			System.out.print(x+" ");
		}
		System.out.println();
		
		//Create a Set collection that will hold Objects of Student Type. 
		//In this set we do not care about the insertion order. 
		//Each student object should have name and studentID. Display name of each student.
		
		Set<Student> students=new HashSet<>();
		students.add(new Student("Tina", "1234"));
		students.add(new Student("Vannia","4567"));
		students.add(new Student("Mike","56778"));
		students.add(new Student("Hichem","12121"));
		
		Iterator<Student> s=students.iterator();
		while(s.hasNext()) {
			s.next().getName();
		}
		
		}
		
	}

class Student {
	String name;
	String studentID;
	
	public Student(String name,String studentID){
		this.name=name;
		this.studentID=studentID;
	}
	
	public void getName() {
		System.out.println(name);
	}
}


