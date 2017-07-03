package com.fannie.day2;

// has become generic 
public class VehicleBL {
	public void showVehicle(Vehicle [] vehicles){
		for(Vehicle temp : vehicles){
			System.out.println("----------------------");
			temp.carryPassenger();
			temp.move();
			
			if(temp instanceof Car){
				((Car) temp).steering();
				((Car) temp).tankCapacity();
			}else if(temp instanceof Bike){
				((Bike) temp).kickStart();
				((Bike) temp).fuelCapcity();
			}
			
		}
	}
}
