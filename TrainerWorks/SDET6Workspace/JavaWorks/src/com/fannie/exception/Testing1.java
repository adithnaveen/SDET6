package com.fannie.exception;

import java.io.IOException;

public class Testing1 {
	
	public static void check() throws IOException{
		throw new IOException("hello");
	}
	
	public static void main(String[] args) {
		try {
			check();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
