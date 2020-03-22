package com.syntax.class15;

public class Google {
	//define features such as empl id, name, last name, salary
	//define a behavior
	int eID;
	String name;
	String lastName;
	int salary;
	String title;
	
	void working() {
	System.out.println(title+ " is working");	
	}
	
	void getPaid() {
		System.out.println(name+" is getting paid "+salary);
	}
	
	void attendMeetings() {
		System.out.println(name+" is attending meetings");
		
	}
	public static void main(String[] args) {
		
		Google e1=new Google();
		
		e1.eID=1234;
		e1.name="John";
		e1.lastName="Smith";
		e1.salary=1000000;
		e1.title="CEO";
		
		e1.working();
		e1.getPaid();
		e1.attendMeetings();
		
		Google e2=new Google();
		
		e2.eID=12345;
		e2.name="Seyma";
		e2.lastName="Atasoy";
		e2.title="QA Engineer";
		e2.salary=100000;
		
		e2.working();
		e2.getPaid();
		e2.attendMeetings();
		
		
		
	}
	

}
