package model.units;

import java.util.ArrayList;
import model.people.Citizen;
import simulation.Address;

abstract public class PoliceUnit extends Unit {
	// Instance Variables
	private ArrayList<Citizen> passengers;
	private int maxCapacity;
	private int distanceToBase;

	// Constructor
	public PoliceUnit(String id, Address location, int stepsPerCycle, int maxCapacity) {
		super(id, location, stepsPerCycle);
		this.maxCapacity = maxCapacity;
		passengers = new ArrayList<Citizen> ();
	}

	public int getMaxCapacity() {
		return maxCapacity;
	}

	public int getDistanceToBase() {
		return distanceToBase;
	}

	public void setDistanceToBase(int distanceToBase) {
		this.distanceToBase = distanceToBase;
	}

}
