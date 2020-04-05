package com.syntax.review07;

public class Hospital {
	
	public static void main(String[] args) {
		
		Doctor.hospitalName="Hackensack Hospital";
		Doctor doc1=new Doctor("John Smith","12345",150000);
//		doc1.name="John Smith";
//		doc1.licenseId="12345";
//		doc1.salary=150000;
		
		//Doctor.hospitalName="New Jersey Hospital";
		System.out.println("Doctor's name is "+doc1.name);
		doc1.displayInfo();
		doc1.chargePatient();
		doc1.treatPatient("Adam Smith");
		
		Doctor.payBills(); 
		
		Doctor doc2=new Doctor("Kasia Stepien","PL1234",300000, "Warsaw, PL");
		doc2.displayInfo();
		doc2.checkUp();
		
		Doctor doc3=new Doctor("Mary James","68975",500000);
	}
	
	Dermatologist derma1=new Dermatologist("Kate","12234",503300,"Derm1234");
	

}
