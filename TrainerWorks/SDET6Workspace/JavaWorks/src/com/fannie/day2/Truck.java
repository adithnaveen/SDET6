package com.fannie.day2;

public class Truck extends Vehicle{

	@Override
	public void move() {
	
	}

	@Override
	public void carryPassenger() {
	
	}

	@Override
	public void accelerate() {
		System.out.println("Speed increased  (Truck): " + (++ speed));		
	}

	@Override
	public void brake() {
		System.out.println("Speed decreased  (Truck): " + (-- speed));		
	}
	
}
