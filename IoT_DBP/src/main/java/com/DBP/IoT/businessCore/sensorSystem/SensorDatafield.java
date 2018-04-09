package com.DBP.IoT.businessCore.sensorSystem;



class SensorDataField {

	private int id;
	private int cipherLength;
	private String type;
	private String name;

	public SensorDataField() {
		
	}

	/**
	 * 
	 * @param name
	 * @param type
	 * @param length
	 */
	public SensorDataField(String name, String type, int cipherLength) {
		this.name=name;
		this.type=type;
		this.cipherLength=cipherLength;
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

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}