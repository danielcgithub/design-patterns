package com.learning.design.patterns.factory.abstrackt;

public class FactoryProducer {

	public static AbstractFactory getFactory(Factories factory) {
		if (factory.equals(Factories.VEHICLE)) {
			return new VehicleFactory();
		} else if (factory.equals(Factories.FUEL)) {
			return new FuelFactory();
		}
		return null;
	}

}
