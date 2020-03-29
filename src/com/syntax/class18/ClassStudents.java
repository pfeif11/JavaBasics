package com.syntax.class18;

public class ClassStudents {
	
	String name;
	int grade1,grade2,grade3;
	int average=(grade1+grade2+grade3)/3;
	
	public void average(int mark1, int mark2, int mark3) {
		int average=(mark1+mark2+mark3)/3;
		System.out.println(average);
	}
	ClassStudents(String firstName,int mark1, int mark2, int mark3) {
		name=firstName;
		grade1=mark1;
		grade2=mark2;
		grade3=mark3;
		System.out.println("Student "+name+" has an average grade of "+((grade1+grade2+grade3)/3));
	}
	
	public static void main(String[] args) {
		
		ClassStudents avg=new ClassStudents("Tina",90,95,91);
		avg.average(90, 95, 91);
	}
	
	
	
	

}
