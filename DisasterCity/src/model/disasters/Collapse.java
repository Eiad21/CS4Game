package model.disasters;

import model.infrastructure.ResidentialBuilding;
import simulation.Rescuable;

public class Collapse extends Disaster {

	// Constructor(s)
	public Collapse(int cycle, ResidentialBuilding target) {
		super(cycle, target);
	}

}
