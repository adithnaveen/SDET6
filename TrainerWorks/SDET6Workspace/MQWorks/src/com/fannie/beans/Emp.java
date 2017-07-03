package com.fannie.beans;

import java.io.Serializable;

public class Emp implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8418816393415621172L;
	private int empId;
	private String empName;
	private int mycount;
	
	private static int count; 
	
	public Emp(int empId, String empName) {
		super();
		this.mycount = count ++;
		this.empId = empId;
		this.empName = empName;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", mycount=" + mycount + "]";
	}


	
	
	
	
}
