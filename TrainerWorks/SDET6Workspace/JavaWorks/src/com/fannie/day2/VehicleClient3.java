package com.fannie.day2;

public class VehicleClient3 {
	public static void main(String[] args) {
		Vehicle [] vehicles = new Vehicle[4];
		// array will start from 0 
		vehicles[0]  = new Car();
		vehicles[1] = new Bike();
		vehicles[2]  = new Car();
		vehicles[3] = new Truck();

		
		VehicleBL bl  = new VehicleBL();
		bl.showVehicle(vehicles);
	}
}
