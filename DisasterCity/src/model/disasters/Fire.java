package model.disasters;

import model.infrastucture.ResidentialBuilding;
import simulation.Rescuable;

public class Fire extends Disaster {

	// Constructor(s)
	public Fire(int cycle, ResidentialBuilding target) {
		super(cycle, target);
	}

}
