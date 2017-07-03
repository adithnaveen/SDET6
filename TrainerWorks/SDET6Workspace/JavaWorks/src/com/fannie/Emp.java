package com.fannie;

// one line
/*
 * multi line 
 */


/**
 * 
 * @author Naveen
 *
 */

class Emp {
	private int empId;
	private String empName;
	private double empSal;
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
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		if(empSal < 5000){
			this.empSal=5000;
			// we can even throw some exception 
			// syso  ctrl + space  
			System.out.println("Sorry Salary cannot be less than 5000 and set to 5000");
		}else{
		this.empSal = empSal;
		}
	}
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + "]";
	}
	@Override
	protected void finalize() throws Throwable {
		System.out.println("The object created purge code goes here...");
	}
}
