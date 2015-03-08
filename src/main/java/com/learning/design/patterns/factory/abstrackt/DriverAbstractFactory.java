package com.learning.design.patterns.factory.abstrackt;

public class DriverAbstractFactory {

	public static void main(String[] args) {
		AbstractFactory vehicleFactory = FactoryProducer
				.getFactory(Factories.VEHICLE);
		Vehicle motorcycle = vehicleFactory.getVehicle(Vehicles.MOTORCYCLE);
		motorcycle.drive();
		
		AbstractFactory fuelFactory = FactoryProducer.getFactory(Factories.FUEL);
		Fuel petrol = fuelFactory.getFuel(FuelOptions.PETROL);
		petrol.fillTheFuel();

	}

}
