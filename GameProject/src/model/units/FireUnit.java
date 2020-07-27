package model.units;

import model.events.WorldListener;
import simulation.Address;

abstract public class FireUnit extends Unit{
	public FireUnit(String id, Address location, int stepsPerCycle,WorldListener worldListener){
		super(id,location,stepsPerCycle,worldListener);
	}
}
