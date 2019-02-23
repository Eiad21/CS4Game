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
		// Initialize all 4 ArrayLists and the world array
	}
	
	// Methods
	private void loadUnits(String filepath) {
		//#TODO Implement method
	}
	private void loadBuildings(String filepath) {
		//#TODO Implement method
	}
	private void loadCitizens(String filepath) {
		//#TODO Implement method
	}
	private void loadDisasters(String filepath) {
		//#TODO Implement method
	}
}
