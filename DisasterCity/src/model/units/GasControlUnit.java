package model.units;

import simulation.Address;

public class GasControlUnit extends FireUnit {
	
	// Constructor
	public GasControlUnit(String id, Address location, int stepsPerCycle) {
		super(id, location, stepsPerCycle);
	}
	
	public static void main(String[]args) {
		GasControlUnit gcu = new GasControlUnit("123", new Address(1,2), 23);
		System.out.println(gcu);
	}

}
