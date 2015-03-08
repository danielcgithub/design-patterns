package com.learning.design.patterns.factory.abstrackt;

public class FuelFactory extends AbstractFactory {

	@Override
	Fuel getFuel(FuelOptions fuel) {
		if (fuel.equals(FuelOptions.DIESEL)) {
			return new Diesel();
		} else if (fuel.equals(FuelOptions.PETROL)) {
			return new Petrol();
		}
		return null;
	}

	@Override
	Vehicle getVehicle(Vehicles vehicle) {
		return null;
	}

}
