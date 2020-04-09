package com.syntax.class25;

public class BOATest {
	
	public static void main(String[] args) {
		
		BOA bank=new BOA();
		bank.trust();
		bank.deposit();
		bank.giveCredit();
		bank.withdraw();
		bank.financing();
		
		Bank bank1=new BOA();
		bank1.deposit();
		bank1.trust();
		bank1.withdraw();
		
		Trustable t=new BOA();
		t.trust();
		
	}

}
