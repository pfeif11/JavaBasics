package com.syntax.class15;

public class CreatingMethods {
	
	//we want to create a method that will accept marks(90, 80)
		// based on the marks it will return grade(A, B, C)
		// if grade > 90--> A, if 90<grade>80 --> B, if 80<grade>70 --> C
	
	char getGrade(int a) {
		char grade=0;
		if (a>=90) {
			grade='A';
		} else if(a<90 && a>=80) {
			grade='B';
		} else if (a<80 && a>=70) {
			grade='C';
		} else if(a<70) {
			grade='F';
		}
		return grade;
		
	}
	public static void main(String[] args) {
		
		CreatingMethods obj=new CreatingMethods();
		char grade=obj.getGrade(85);
		System.out.println(grade);
		System.out.println(obj.getGrade(65));
		
		//if grade is A or B --> good job, otherwise --> study more
		
		if(grade=='A' || grade=='B') {
			System.out.println("Good job");
		}
		else {
			System.out.println("Please study more");
		}
	}
	

}
