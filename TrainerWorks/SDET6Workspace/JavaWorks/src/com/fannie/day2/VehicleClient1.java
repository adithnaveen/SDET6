package com.fannie.day2;

// The super class can always reference to sub class 
// viceversa is false, it has to be type casted 
public class VehicleClient1 {
	public static void main(String[] args) {
		// v is called reference 
		Vehicle v;
		 // v here is called Instance of class Car
		v = new Car();
		// the object v is called polymorphic 
		v.move();
		v.carryPassenger();
		// type casting 
		((Car)v).steering();
		((Car)v).tankCapacity();
		
		System.out.println("--------------------");
		
		v = new Bike();

		v.move();
		v.carryPassenger();
		((Bike)v).kickStart();
		((Bike)v).fuelCapcity();
	}
}
