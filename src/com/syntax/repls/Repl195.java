package com.syntax.repls;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

class Employee{
	  private String fullName;
	  private String ssn;
	  private double salary;
	  
	  public Employee(String fullName,String ssn,double salary) {
	    this.fullName=fullName;
	    this.ssn=ssn;
	    this.salary=salary;
	  }
	  
	  public String getName(){
	    return fullName;
	  }
	  public String getSsn(){
	    return ssn;
	  }
	  public double getSalary(){
	    return salary;
	  }
	  
	}
public class Repl195 {
	public static void main(String[] args) {
	    Set<Employee> emps=new LinkedHashSet<>();
	    emps.add(new Employee("John Doe","123456789",80000));
	    emps.add(new Employee("Jane Smith","987654321",90000));
	    emps.add(new Employee("Jackie Chan","0",100000));
	    Iterator<Employee> it=emps.iterator();
	    while(it.hasNext()) {
	       Employee x=it.next();
	    
	     System.out.println(x.getName());
	     System.out.println(x.getSsn());
	     System.out.println(x.getSalary());
	    }
	  }
}
