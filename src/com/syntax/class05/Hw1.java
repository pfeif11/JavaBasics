package com.syntax.class05;

public class Hw1 {
	public static void main(String[] args) {
	
		double quiz=50;
		double midTerm=10;
		double finalScore=10;
		double average=((quiz+midTerm+finalScore)/3);
		String grade;
		
		if(average>=90) {
			grade="A";
		}
		else if(average>=70 && average<90) {
			grade="B";
		}
		else if(average>=50 && average<70) {
			grade="C";
		}
		else {
			grade="F";
		}
		System.out.println(grade);
	}
}
