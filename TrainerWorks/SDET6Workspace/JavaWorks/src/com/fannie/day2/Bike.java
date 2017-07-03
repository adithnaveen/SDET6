package com.fannie.day2;

public class Bike extends Vehicle{
	
	public Bike() {
		System.out.println("Hi We are Constructing Your Ordered Bike.. ");
		}
		public void kickStart(){
			System.out.println("Bikes come with Kick start...");
		}
		
		public void fuelCapcity(){
			System.out.println("Bike has fuel capacity...");
		}
		@Override
		public void move() {
			System.out.println("Bike moves with 2 Wheels... ");
		}
		@Override
		public void carryPassenger() {
			System.out.println("Bike can carry 1-2 people, for enjoyable ride ");
		}
		@Override
		public void accelerate() {
			System.out.println("Speed increased  (Bike): " + (++ speed));		
		}
		@Override
		public void brake() {
			System.out.println("Speed decreased  (Bike): " + (-- speed));			
		}
}
