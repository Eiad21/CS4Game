package simulation;

import java.util.ArrayList;

import model.disasters.Disaster;
import model.infrastucture.ResidentialBuilding;
import model.people.Citizen;

public class Simulator {

	// Instance Variables
	private int currentCycle;
	private ArrayList<ResidentialBuilding> buildings = new ArrayList<ResidentialBuilding> ();
	private ArrayList<Citizen> citizens = new ArrayList<Citizen> ();
	private ArrayList<Disaster> plannedDisasters = new ArrayList<Disaster> ();
	private ArrayList<Disaster> executedDisasters = new ArrayList<Disaster> ();
	private Address[][] world = new Address[10][10];

	// Constructor(s)
	public Simulator() {
		
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
