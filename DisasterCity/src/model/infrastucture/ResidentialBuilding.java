package model.infrastucture;
import simulation.*;
import model.people.*;
import java.util.ArrayList;
import model.disasters.*;

public class ResidentialBuilding {
private Address location;
private int structuralIntegrity;
private int fireDamage;
private int gasLevel;
private int foundationDamage;
private ArrayList<Citizen> occupants;
private Disaster disaster;

//Constructor
public ResidentialBuilding(Address location){
this.location =location;
structuralIntegrity=100;
fireDamage=0;
gasLevel=0;
foundationDamage=0;
}

//Getters
public Address getLocation() {
	return location;
}

public int getStructuralIntegrity() {
	return structuralIntegrity;
}

public int getFireDamage() {
	return fireDamage;
}

public int getGasLevel() {
	return gasLevel;
}

public int getFoundationDamage() {
	return foundationDamage;
}

public ArrayList<Citizen> getOccupants() {
	return occupants;
}

public Disaster getDisaster() {
		return disaster;
}

//Setters
public void setStructuralIntegrity(int structuralIntegrity) {
	this.structuralIntegrity = structuralIntegrity;
}

public void setFireDamage(int fireDamage) {
	this.fireDamage = fireDamage;
}

public void setGasLevel(int gasLevel) {
	this.gasLevel = gasLevel;
}

public void setFoundationDamage(int foundationDamage) {
	this.foundationDamage = foundationDamage;
}


}
