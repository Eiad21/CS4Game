package simulation;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
	public Simulator() throws NumberFormatException, IOException {
		String currentLine = "";
		FileReader fileReader= new FileReader("buildings.csv");
		BufferedReader br = new BufferedReader(fileReader);
		while ((currentLine = br.readLine()) != null)  {
		String[] a = currentLine.split(",");
		Address c = world[Integer.parseInt(a[0])][Integer.parseInt(a[1])];
		ResidentialBuilding b = new ResidentialBuilding(c);
		buildings.add(b);
		}
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
