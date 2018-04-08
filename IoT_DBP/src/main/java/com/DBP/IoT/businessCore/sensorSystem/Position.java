package com.DBP.IoT.businessCore.sensorSystem;


public class Position implements SensorGroupToPosition {

	private int ID;
	private String identifyingName;

	public Position() {
	
	}

	/**
	 * 
	 * @param IdentifyingName
	 */
	public Position(String IdentifyingName) {
		this.identifyingName = IdentifyingName;
	}

	public int getID() {
		return this.ID;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		this.ID = ID;
	}

	public String getIdentifyingName() {
		// TODO - implement Position.getIdentifyingName
		return this.identifyingName; 
	
	}

	/**
	 * 
	 * @param identifier
	 */
	public void setIdentifyingName(String identifier) {
		this.identifyingName = identifier;
	}

}