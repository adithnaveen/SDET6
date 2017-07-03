package com.fannie.exception;

public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			int num1 = 10;
			int num2 = 0;
			try {
				int num[] = new int[4];
			} catch (NegativeArraySizeException nase) {
				System.out.println("you tried dividing by zero, i'm from nested exception");
			}
			int result = num1 / num2;

			System.out.println("Result is " + result);
			return ;
		} catch (ArithmeticException ae) {
			System.out.println("You tried dividing by zero " + ae.getMessage());
		} catch (NegativeArraySizeException nase) {
			System.out.println("Hey dont create an arry with -ve values");
		} catch (Exception e) {
			System.out.println("Sorry something went wrong contact out team");
		} finally {
			// 100 % 
			System.out.println("hey i'm from finally...");
		}
		System.out.println("hey i'm some other business logic... ");
	}
}
