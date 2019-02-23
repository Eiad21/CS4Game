package model.people;

import model.disasters.*;
import simulation.*;

public class Citizen implements Simulatable, Rescuable {
	private CitizenState state;
	private Disaster disaster;
	private Address location;
	private String nationalID;
	private String name;
	private int age;
	private int hp;
	private int bloodLoss;
	private int toxicity;

	// Constructor
	public Citizen(Address location, String nationalID, String name, int age) {
		this.location = location;
		this.nationalID = nationalID;
		this.name = name;
		this.age = age;
		state = CitizenState.SAFE;
		hp = 100;
		bloodLoss = 0;
		toxicity = 0;
	}

	// Getter(s)
	public CitizenState getState() {
		return state;
	}

	public Disaster getDisaster() {
		return disaster;
	}

	public Address getLocation() {
		return location;
	}

	public String getNationalID() {
		return nationalID;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHp() {
		return hp;
	}

	public int getBloodLoss() {
		return bloodLoss;
	}

	public int getToxicity() {
		return toxicity;
	}

	// Setter(s)
	public void setState(CitizenState state) {
		this.state = state;
	}

	public void setLocation(Address location) {
		this.location = location;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public void setBloodLoss(int bloodLoss) {
		this.bloodLoss = bloodLoss;
	}

	public void setToxicity(int toxicity) {
		this.toxicity = toxicity;
	}
}
