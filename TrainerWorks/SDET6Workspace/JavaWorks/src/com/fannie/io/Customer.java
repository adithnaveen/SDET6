package com.fannie.io;

import java.io.Serializable;

public class Customer implements Serializable{
	private int custId;
	private String custName;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + "]";
	}
	public Customer(int custId, String custName) {
		super();
		this.custId = custId;
		this.custName = custName;
	}
	
	// generate getters and setters 
	
	// generate parametric constructors 
	
	// generate to string 
}
