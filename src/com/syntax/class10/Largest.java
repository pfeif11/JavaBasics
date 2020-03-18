package com.syntax.class10;

public class Largest {
	public static void main(String[] args) {

		int[] nums = { 200, 30, -1, 900, 56, 787 };
		int largest=nums[0]; //assume the first element is the largest
		
		for(int i=0;i<nums.length;i++) {
			if(nums[i]>largest) {
				largest=nums[i];
			}
			
		}System.out.println("The largest number:"+largest);
		
		
		
		for(int i:nums) {
			
			if(i>largest) {
				largest=i;
				
			}
		}
		System.out.println("The largest number is "+largest);

	}

}
