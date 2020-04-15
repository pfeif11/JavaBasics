package com.syntax.repls;

public class Account {
	private String acc_no;
	  private String name;
	  private String email;
	  private double amount;
	  
	  public void setAcc(String acc_no) {
	    this.acc_no=acc_no;
	  }
	  
	  public void setName(String name) {
	    this.name=name;
	    
	  }
	  
	  public void setEmail(String email) {
	    this.email=email;
	  }
	  
	  public void setAmount(double amount) {
	    this.amount=amount;
	  }
	  
	  public String getAcc() {
	    return acc_no;
	  }
	  
	  public String getName() {
	    return name;
	  }
	  
	  public String getEmail() {
	    return email;
	  }
	  
	  public double getAmount() {
	    return amount;
	  }
}
