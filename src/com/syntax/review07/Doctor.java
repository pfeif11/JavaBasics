package com.syntax.review07;

public class Doctor {
	static String hospitalName;//variable does not belong to the object, it belongs to the class
	String name;
	String licenseId;
	int salary;
	
	String address;
	
	public Doctor() {
		
	}
	
	public Doctor(String name, String licenseId, int salary) {
		this.name=name;
		this.licenseId=licenseId;
		this.salary=salary;
	}
		
		public Doctor(String name, String licenseId, int salary, String address) {
			this.name=name;
			this.licenseId=licenseId;
			this.salary=salary;
			this.address=address;
		
	}
	
	public void checkUp() {
		System.out.println("Doctor "+name+" has ordered blood test");
	}
	
	public void treatPatient(String patientName) {
		System.out.println("Doctor "+name+" gives prescription to "+patientName);
		chargePatient();
	}
	
	public void chargePatient() {
		System.out.println("Let me charge you $100");
	}
	
	public void displayInfo() {
		System.out.println("Doctor "+name+" with license ID number "+
	licenseId+" has a salary of "+salary+" works for "+hospitalName+" "+address);
	}
	
	public static void payBills() {
		System.out.println("Everybody pays bills");
	}

}
