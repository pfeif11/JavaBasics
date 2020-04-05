package com.syntax.review07;

public class Dermatologist extends Doctor {

	String dermaId;

	public Dermatologist(String name, String licenseId, int salary, String dermaId) {
		super(name, licenseId, salary);
		super.chargePatient();
		this.dermaId = dermaId;
	}

	public void skinTest() {

	}

}
