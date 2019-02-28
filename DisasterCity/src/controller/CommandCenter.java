package controller;

import model.infrastructure.ResidentialBuilding;
import simulation.Simulator;
import model.people.Citizen;
import model.units.Unit;

import java.util.ArrayList;

public class CommandCenter {
	// Instance Variables
	private Simulator engine;
	private ArrayList<ResidentialBuilding> visibleBuildings;
	private ArrayList<Citizen> visibleCitizens;
	private ArrayList<Unit> emergencyUnits;

	// Constructor
	public CommandCenter() throws Exception {
		engine = new Simulator();
		visibleBuildings = new ArrayList<ResidentialBuilding>();
		visibleCitizens = new ArrayList<Citizen>();
		emergencyUnits = new ArrayList<Unit>();

	}

}
