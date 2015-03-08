package com.learning.design.patterns.factory;

public class FactoryDriver {

	public static void main(String[] args) {
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		Vehicle car = vehicleFactory.getVehicle(Vehicles.CAR);
		car.drive();
		
		Vehicle truck = vehicleFactory.getVehicle(Vehicles.TRUCK);
		truck.drive();
				 
	}

}
