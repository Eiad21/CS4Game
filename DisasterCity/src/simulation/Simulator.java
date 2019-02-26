package simulation;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.disasters.Disaster;
import model.infrastructure.ResidentialBuilding;
import model.people.Citizen;
import model.units.Unit;

public class Simulator {
	// Static Variables
	FileReader fileReader;
	BufferedReader br;
	
	// Instance Variables
	private int currentCycle;
	private ArrayList<Unit> emergencyUnits;
	private ArrayList<ResidentialBuilding> buildings;
	private ArrayList<Citizen> citizens;
	private ArrayList<Disaster> plannedDisasters;
	private ArrayList<Disaster> executedDisasters;
	private Address[][] world;

	
	public Simulator() throws Exception {
		emergencyUnits = new ArrayList<>();
		buildings = new ArrayList<ResidentialBuilding>();
		citizens = new ArrayList<Citizen>();
		plannedDisasters = new ArrayList<Disaster>();
		executedDisasters = new ArrayList<Disaster>();
		world = new Address[10][10];
	}

	private void loadUnits(String filepath) throws Exception {
		// TODO: Implement method
	}

	private void loadBuildings(String filepath) throws Exception {
		String currentLine = "";
		fileReader = new FileReader(filepath);
		br = new BufferedReader(fileReader);
		while ((currentLine = br.readLine()) != null) {
			String[] a = currentLine.split(",");
			Address c = world[Integer.parseInt(a[0])][Integer.parseInt(a[1])];
			ResidentialBuilding b = new ResidentialBuilding(c);
			buildings.add(b);
		}
	}

	private void loadCitizens(String filepath) throws Exception {
		String currentLine = "";
		fileReader = new FileReader(filepath);
		br = new BufferedReader(fileReader);
		while ((currentLine = br.readLine()) != null) {
			String[] a = currentLine.split(",");
			Address c = world[Integer.parseInt(a[0])][Integer.parseInt(a[1])];
			Citizen citizen = new Citizen(c,a[2],a[3],Integer.parseInt(a[4]));
			citizens.add(citizen);
		}
	}

	private void loadDisasters(String filepath) throws Exception {
		// TODO: Implement method
	}
}
