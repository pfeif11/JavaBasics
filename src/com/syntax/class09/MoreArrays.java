package com.syntax.class09;

public class MoreArrays {
	public static void main(String[] args) {
		//arrays are fixed in size
		//if we add for values then we delcared--> ArrayIndexOutOfBoundsException
		String[] students=new String[3];
		students[0]="Hassna";
		students[1]="Faisal";
		students[2]="Kemal";
		//students[3]="Aaron"; - Java is going to complain during runtime -->ArrayIndexOutOfBoundsException
		
		//System.out.println(students[2]);
		//if we store less elements than we declared, complier will add default values
		String[] inClassStudents=new String[5];
		inClassStudents[0]="Hichem";
		inClassStudents[1]="Tetteh";
		inClassStudents[2]="Tina";
		inClassStudents[3]="Mike";
		inClassStudents[4]="Vannia";
		
		
		System.out.println(inClassStudents[2]);
	}

}
