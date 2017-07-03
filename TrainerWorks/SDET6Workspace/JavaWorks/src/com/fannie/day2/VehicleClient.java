package com.fannie.day2;

public class VehicleClient {
	public static void main(String[] args) {
		Car c = new Car();
		c.steering();
		c.tankCapacity();
		c.move();
		c.carryPassenger();
	
		System.out.println("-----------------------------");
		
		Bike b = new Bike();
		b.kickStart();
		b.fuelCapcity();
		b.move();
		b.carryPassenger();
		// not good practice 
//		 Vehicle v = new Vehicle();
//		v.move();
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
