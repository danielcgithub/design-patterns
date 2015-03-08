package com.learning.design.patterns.factory.abstrackt;

public class VehicleFactory  extends AbstractFactory{

	@Override
	Fuel getFuel(FuelOptions fuel) {
		return null;
	}

	@Override
	Vehicle getVehicle(Vehicles vehicle) {
		if(vehicle.equals(Vehicles.CAR)){
			return new Car();
		}else if (vehicle.equals(Vehicles.MOTORCYCLE)){
			return new Motorcycle();
		}
		return null;
	}

}
