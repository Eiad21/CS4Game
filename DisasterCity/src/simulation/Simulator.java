package simulation;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import model.disasters.Disaster;
import model.disasters.Fire;
import model.disasters.GasLeak;
import model.disasters.Infection;
import model.disasters.Injury;
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
		loadCitizens("citizens.csv");
		loadBuildings("buildings.csv");
		loadDisasters("disasters.csv");
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
		String currentLine = "";
		fileReader = new FileReader(filepath);
		br = new BufferedReader(fileReader);
		while ((currentLine = br.readLine()) != null) {
			String[] a = currentLine.split(",");
			int startCycle = Integer.parseInt(a[0]);
			Disaster disaster;
			switch(a[1]) {
			case "FIR":
				disaster = new Fire(startCycle, getBuilding(Integer.parseInt(a[2]),Integer.parseInt(a[2])));break;
			case"GLK":	
				disaster = new GasLeak(startCycle, getBuilding(Integer.parseInt(a[2]),Integer.parseInt(a[2])));break;
			case"INJ":
				disaster = new Injury(startCycle, getCitizen(a[2]));break;
			case"INF":
				disaster = new Infection(startCycle, getCitizen(a[2]));break;
			default:
				disaster = null;
				
			}
			plannedDisasters.add(disaster);
		}
	}
	private ResidentialBuilding getBuilding(int x, int y) {
		for(ResidentialBuilding building : buildings) {
			if(building.getLocation()==world[x][y])
				return building;
		}
		return null;
	}
	private Citizen getCitizen(String nationalID) {
		for(Citizen citizen : citizens) {
			if(citizen.getNationalID() == nationalID)
				return citizen;
		}
		return null;
	}
}
