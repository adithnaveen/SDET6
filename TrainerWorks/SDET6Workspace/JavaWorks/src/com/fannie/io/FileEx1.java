package com.fannie.io;

import java.io.File;
import java.io.IOException;

// auto import ctrl + shift + o 
public class FileEx1 {
	public static void main(String[] args) {
		// this is the reference 
		File f = new File("Emp.txt");
		
		// alt + shift + z to surround with try catch block 
//		try {
//			// file creation happens here 
//			boolean flag = f.createNewFile();
//			System.out.println(flag ?"File Created":"Not Created");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		System.out.println(f.getAbsolutePath());
		System.out.println("is readable " + f.canRead());
		System.out.println("is writable " + f.canWrite());
		System.out.println("is file " + f.isFile());
	}
}













