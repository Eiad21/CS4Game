package model.units;

import model.people.Citizen;
import simulation.Address;

abstract public class MedicalUnit extends Unit {

	//Instance Variables
private int healingAmount;
private int treatmentAmount;

    //Constructor
public MedicalUnit(String id, Address location, int stepsPerCycle){
	super(id,location,stepsPerCycle);
	healingAmount=10;
	treatmentAmount=10;
}

}
