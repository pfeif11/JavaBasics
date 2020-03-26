package com.syntax.class17;

public class AccessingMembersOfClass {
	
	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.name="Faisal";
		emp.lastName="Sakhi";
		emp.salary=100000;
		//emp.ssn=987182039; CE - The field ssn is not visible
	
		Employee.method1();
		emp.method2();
		emp.method3();
		//emp.method4(); CE - method 4 is not visible
	
	}

}
