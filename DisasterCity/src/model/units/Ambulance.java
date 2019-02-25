package model.units;

import simulation.Address;

public class Ambulance extends MedicalUnit {
	
	// Constructor
	public Ambulance(String id, Address location, int stepsPerCycle){
		super(id, location, stepsPerCycle);
	}

}
