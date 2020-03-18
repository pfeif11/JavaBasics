package com.syntax.review03;

public class ForLoopOddEven {
	public static void main(String[] args) {
		int totalOdd=0;
		int totalEven=0;
		int grandTotal=0;
		for(int count=1;count<=50;count++) {
			if(count%2==0) {
			totalEven+=count;
			
			}
			else {
				totalOdd+=count;
				
			}
			grandTotal+=count;
			
		}
		System.out.println("The sum of the odd numbers is "+totalOdd);
		System.out.println("The sum of the even numbers is "+totalEven);
		System.out.println("Grand total="+grandTotal);
	}

}
