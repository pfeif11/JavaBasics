package com.syntax.class09;

public class Clock {
	public static void main(String[] args) {
		
		//using nest loop, try to print a clock
		for(int hour=0;hour<=23;hour++) {
			for(int minutes=0;minutes<=59;minutes++) {
				if(minutes<10) {
					System.out.println(hour+":"+0+minutes);
				}
				else {
					System.out.println(hour+":"+minutes);
				}
				
			}
		}
	}

}
