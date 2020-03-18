package com.syntax.class07;

public class InfiniteLoopIntro {
	public static void main(String[] args) {
		int time=10;
		
		if(time<12) {
			System.out.println("Good morning");
		}
		
		
		//while(time<12) {
			//System.out.println("Good morning"); //code will execute infinitely
		//}
		System.out.println("---------------WHILE LOOP----------------");
		while(time>12) {
			System.out.println("Good morning");
			time++;
		
	}
		//how to print numbers from 1 -50?
		int num=1;
		while(num<=50) {
			System.out.println(num);
			num++;
		}
		int num1=20;
		while(num1<=30) {
			System.out.println(num1);
			num1++;
			
		}
		
		System.out.println("********************************");
		int num2=5;
		while(num2<=15) {
			System.out.print(num2+" ");
			num2++;
		}
		System.out.println("********************************");
		int num3=10;
		while (num3>=1) {
			System.out.print(num3+ " ");
			num3--;
		}
		
		System.out.println("**************************");
		
		int num4=50;
		while(num4>=1) {
			System.out.print(num4+" ");
			num4--;
		}
		
		System.out.println("******************************************");
		//first way
		int num5=1;
		while(num5<20) {
			System.out.print(num5+" ");
			num5+=2;
			
		}
		//second way using mod and if condition
		int num6=1;
		while(num6<20) {
			if(num6%2!=0) {
			System.out.print(num6+" "); }
			num6++;
			
			
		}
		System.out.println("**********************************");
		//third way
		int y=1;
		while(y<=20) {
			System.out.println(y++);
			y++;
		}
		
		

}
}
