package com.fannie.statics;

public class Addition {

	int num1;
	int num2;
	
	public static  void add(int a, int b){
		System.out.println(a + b);
	}
	
	public static void main(String[] args) {
		add(20, 30);
	}
}