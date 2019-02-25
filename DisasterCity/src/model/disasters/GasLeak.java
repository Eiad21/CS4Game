package model.disasters;

import model.infrastructure.ResidentialBuilding;
import simulation.Rescuable;

public class GasLeak extends Disaster {

	// Constructor(s)
	public GasLeak(int cycle, ResidentialBuilding target) {
		super(cycle, target);
	}

}
