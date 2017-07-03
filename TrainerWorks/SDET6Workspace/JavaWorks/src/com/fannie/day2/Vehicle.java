package com.fannie.day2;
// this is class is contract 
public  abstract class Vehicle {
	int speed;
	public Vehicle() {
		super();  // Object 
		System.out.println("Vehicle is constructed...");
	}
	public abstract void move() ;
	public abstract void carryPassenger() ;
	public abstract void accelerate();
	public abstract void brake();
}
