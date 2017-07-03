package com.fannie.day2;

public class VehicleClient2 {
	public static void main(String[] args) {
		Vehicle [] vehicles = new Vehicle[4];
		// array will start from 0 
		vehicles[0]  = new Car();
		vehicles[1] = new Bike();
		vehicles[2]  = new Car();
		vehicles[3] = new Truck();


		for(int i=0; i< vehicles.length; i++){
			System.out.println("-------------------------------");
			vehicles[i].move();
			vehicles[i].carryPassenger();
			
			if(vehicles[i] instanceof Car){
				((Car)vehicles[i]).steering();
				((Car)vehicles[i]).tankCapacity();
			}else if(vehicles[i] instanceof Bike){
				((Bike)vehicles[i]).kickStart();
				((Bike)vehicles[i]).fuelCapcity();
			}
			
		}
		
		
		
	}
}
