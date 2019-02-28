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
import model.units.Ambulance;
import model.units.DiseaseControlUnit;
import model.units.Evacuator;
import model.units.FireTruck;
import model.units.GasControlUnit;
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

		// Initialization of world array
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 10; j++)
				world[i][j] = new Address(i, j);
		loadBuildings("buildings.csv");
		loadCitizens("citizens.csv");
		loadDisasters("disasters.csv");
		loadUnits("units.csv");
	}

	private void loadUnits(String filepath) throws Exception {
		String currentLine = "";
		fileReader = new FileReader(filepath);
		br = new BufferedReader(fileReader);
		while ((currentLine = br.readLine()) != null) {
			String[] a = currentLine.split(",");
			Unit unit;
			switch (a[0]) {
			case "AMB":
				unit = new Ambulance(a[1], world[0][0], Integer.parseInt(a[2]));
				break;
			case "DCU":
				unit = new DiseaseControlUnit(a[1], world[0][0], Integer.parseInt(a[2]));
				break;
			case "EVC":
				unit = new Evacuator(a[1], world[0][0], Integer.parseInt(a[2]), Integer.parseInt(a[3]));
				break;
			case "FTK":
				unit = new FireTruck(a[1], world[0][0], Integer.parseInt(a[2]));
				break;
			case "GCU":
				unit = new GasControlUnit(a[1], world[0][0], Integer.parseInt(a[2]));
				break;
			default:
				unit = null;

			}
			emergencyUnits.add(unit);
		}
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
			int citX = Integer.parseInt(a[0]);
			int citY = Integer.parseInt(a[1]);
			Address c = world[citX][citY];
			Citizen citizen = new Citizen(c, a[2], a[3], Integer.parseInt(a[4]));
			citizens.add(citizen);
			for (ResidentialBuilding b : buildings) {
				if (b.getLocation().getX() == citX && b.getLocation().getY() == citY)
					b.addOccupant(citizen);
			}
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
			switch (a[1]) {
			case "FIR":
				disaster = new Fire(startCycle, getBuilding(Integer.parseInt(a[2]), Integer.parseInt(a[2])));
				break;
			case "GLK":
				disaster = new GasLeak(startCycle, getBuilding(Integer.parseInt(a[2]), Integer.parseInt(a[2])));
				break;
			case "INJ":
				disaster = new Injury(startCycle, getCitizen(a[2]));
				break;
			case "INF":
				disaster = new Infection(startCycle, getCitizen(a[2]));
				break;
			default:
				disaster = null;

			}
			plannedDisasters.add(disaster);
		}
	}

	private ResidentialBuilding getBuilding(int x, int y) {
		for (ResidentialBuilding building : buildings) {
			if (building.getLocation().getX() == x && building.getLocation().getY() == y)
				return building;
		}
		return null;
	}

	private Citizen getCitizen(String nationalID) {
		for (Citizen citizen : citizens) {
			if (citizen.getNationalID().equals(nationalID))
				return citizen;
		}
		return null;
	}
}
