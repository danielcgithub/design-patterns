package com.learning.design.patterns.factory.abstrackt;

import com.learning.design.patterns.factory.abstrackt.Vehicles;

public abstract class AbstractFactory {
	
	abstract Fuel getFuel(FuelOptions fuel);
	abstract Vehicle getVehicle(Vehicles vehicle);

}
