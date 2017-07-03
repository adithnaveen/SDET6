package com.fannie.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadWrite {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		BufferedWriter bw = null;
		try {
			System.out.println("Enter Employee Id");
			int empId = Integer.parseInt(br.readLine());

			System.out.println("Enter Employee Name ");
			String empName = br.readLine();
			
		
			System.out.println("Emp id is " + empId);
			System.out.println("Emp Name is " + empName);
			
			// if the file does not exists then it will create 
			File f = new File("Emp.txt");
			FileWriter fw = new FileWriter(f, true);
			 bw = new BufferedWriter(fw);
			
			bw.write(empId +", " + empName);
			bw.newLine();
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		} finally{
			try {
				bw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
