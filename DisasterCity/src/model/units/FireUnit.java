package model.units;

import simulation.Address;

abstract public class FireUnit extends Unit {

	// Constructor
	public FireUnit(String id, Address location, int stepsPerCycle) {
		super(id, location, stepsPerCycle);
	}

}
