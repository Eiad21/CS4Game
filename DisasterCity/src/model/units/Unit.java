package model.units;

import simulation.*;

abstract public class Unit implements Simulatable {
 
	 // Instance Variables
	private String unitID;
	private UnitState state;
	private Address location;
	private Rescuable target;
	private int distanceToTarget;
	private int stepsPerCycle;

	 // Constructor
	public Unit(String id, Address location, int stepsPerCycle) {
		unitID = id;
		this.location = location;
		this.stepsPerCycle = stepsPerCycle;
		state = UnitState.IDLE;
	}

	 // Getters
	public String getUnitID() {
		return unitID;
	}

	public UnitState getState() {
		return state;
	}

	public Address getLocation() {
		return location;
	}

	public Rescuable getTarget() {
		return target;
	}

	public int getStepsPerCycle() {
		return stepsPerCycle;
	}

	 // Setters
	public void setState(UnitState state) {
		this.state = state;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

}
