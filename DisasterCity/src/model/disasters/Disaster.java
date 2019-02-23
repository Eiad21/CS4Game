package model.disasters;

import simulation.Rescuable;
import simulation.Simulatable;

abstract public class Disaster implements Simulatable {
	// Instance Variables
	private int startCycle;
	private Rescuable target;
	private boolean active;

	// Constructor(s)
	public Disaster(int startCycle, Rescuable target) {
		this.startCycle = startCycle;
		this.target = target;
		active = false;
	}

	// Getter(s)
	public int getStartCycle() {
		return startCycle;
	}

	public Rescuable getTarget() {
		return target;
	}

	public boolean getActive() {
		return active;
	}

	// Setter(s)
	public void setActive(boolean active) {
		this.active = active;
	}

}
