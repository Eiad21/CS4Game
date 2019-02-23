package simulation;

import java.util.ArrayList;

import model.disasters.Disaster;
import model.infrastucture.ResidentialBuilding;
import model.people.Citizen;

public class Simulator {

	// Instance Variables
	private int currentCycle;
	private ArrayList<ResidentialBuilding> buildings;
	private ArrayList<Citizen> citizens;
	private ArrayList<Disaster> plannedDisasters;
	private ArrayList<Disaster> executedDisasters;
	private Address[][] world;

	// Constructor(s)
	public Simulator() {
		// #TODO Implement body of constructor
	}
}
