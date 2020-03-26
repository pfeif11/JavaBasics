package com.syntax.class17_1;

import com.syntax.class17.Employee;

public class AccessingMembersOfDifferentClass {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.name="Faisal";
		//emp.lastName="Sakhi"; not visible (different package)
		//emp.salary=100000; not visible (different package)
		//emp.ssn=987182039; CE - The field ssn is not visible
		
		Employee.method1();
		//emp.method2(); not visible (different package)
		//emp.method3();not visible (different package)
		//emp.method4(); CE - method 4 is not visible
	}

}
