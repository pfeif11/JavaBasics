package com.syntax.class20;

public class Test {
	
	
	public static void main(String[] args) {
		ProductOwner e1=new ProductOwner();
		e1.empNumber=12;
		e1.salary=300000;
		e1.getPaid();
		e1.work();
		e1.prioritizeBacklog();
		
		Developer e2=new Developer();
		e2.empNumber=13;
		e2.salary=175000;
		e2.getPaid();
		e2.work();
		e2.coding();
		
	}

	

}
