package com.syntax.grouphw;

public abstract class Mark {
	
	abstract double getPercentage();

}

class A extends Mark {
	int sub1,sub2,sub3;
	public A(int sub1, int sub2, int sub3) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	
	@Override
	double getPercentage() {
		double avg=(sub1+sub2+sub3)/3;
		
		return avg;
	}
	
}

class B extends Mark {
	int sub1,sub2,sub3,sub4;
	public B(int sub1, int sub2, int sub3,int sub4) {
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
		this.sub4=sub4;
	}
	
	@Override
	double getPercentage() {
		double a=(sub1+sub2+sub3+sub4)/4;
		return a;
	}
	
}



