package com.learning.design.patterns.factory;

public class VehicleFactory {

	public Vehicle getVehicle(Vehicles vehicles){
		if(vehicles.equals(Vehicles.CAR)){
			return new Car();
		}else if(vehicles.equals(Vehicles.TRUCK)){
			return new Truck();
		}else{
			return null;
		}
	}
}
