package com.fannie.day2;

public class Car extends Vehicle{
	// if you dont have the contructor then 
	// compiler shall give default constructor 
	public Car(){
		// every constructor shall have super word 
		// if you dont have then constructor shall 
		// have one, and if you have then super()
//		shall be the first statement in the 
//		constructor 
		super();
		System.out.println("Hi We are construcing CAR");
	}
	
	public void steering(){
		System.out.println("All Cars have Steering...");
	}
	
	public void tankCapacity(){
		System.out.println("All Cars shall have fuel tank, with limit...");
	}
	// the child has overridden the parent 
	// behaviour 
	@Override
	public void move(){
		System.out.println("Car Moves with 4 Wheels");
	}
	@Override
	public void carryPassenger() {
		System.out.println("Car can carry 4-5 Passengers at a given time");
	}

	@Override
	public void accelerate() {
		System.out.println("Speed increased  (Car): " + (++ speed));
	}

	@Override
	public void brake() {
		System.out.println("Speed decreased (Car): " + (--speed));
	}
}
