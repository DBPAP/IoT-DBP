package com.DBP.IoT.businessCore.sensorSystem;



class SensorDataField {

	private int ID;
	private int cipherLength;
	private String type;
	private String name;

	public SensorDataField() {
		// TODO - implement SensorDataField.SensorDataField
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param type
	 * @param length
	 */
	public SensorDataField(String name, String type, int length) {
		// TODO - implement SensorDataField.SensorDataField
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement SensorDataField.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement SensorDataField.setID
		throw new UnsupportedOperationException();
	}

	public int getCipherLength() {
		return this.cipherLength;
	}

	/**
	 * 
	 * @param cipherLength
	 */
	public void setCipherLength(int cipherLength) {
		this.cipherLength = cipherLength;
	}

	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

}