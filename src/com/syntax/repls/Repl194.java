package com.syntax.repls;

import java.util.HashSet;
import java.util.Set;

class Student{
  int studentId;
  String name;
  String lastName;
  Student(int studentId, String name, String lastName) {
    this.studentId=studentId;
    this.name=name;
    this.lastName=lastName;
  }
  void displayDetails() {
	    System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId);
	  }
}
public class Repl194 {
	 public static void main(String[] args) {
		   
		   Set<Student> students=new HashSet<>();
		   students.add(new Student(101,"Samir","Jawaid"));
		   
		   for(Student s:students) {
			   s.displayDetails();
		   }
		   
		   
		   
		 }

}
