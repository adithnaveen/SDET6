package com.fannie.interfaces;

import java.util.Arrays;

public class NumberSort {
	public static void main(String[] args) {
		int [] nums = {23,4,3,244,56,32,67,8};

		for(int temp : nums){
			System.out.println(temp);
		}
		
		System.out.println("------------------------");

		Arrays.sort(nums);

		for(int temp : nums){
			System.out.println(temp);
		}
		
	}
}
