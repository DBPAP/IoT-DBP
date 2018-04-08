package com.DBP.IoT.businessCore.sensorSystem;


class Sensor {

	private int internalID;
	private String publicID;
	private String brand;
	private SensorType type;
	private SensorGroup group;

	public SensorType getType() {
		return this.type;
	}

	public SensorGroup getGroup() {
		return this.group;
	}

	/**
	 * 
	 * @param publicId
	 */
	public void setPublicID(String publicId) {
		this.publicID=publicId;
	}

	/**
	 * 
	 * @param sensorType
	 */
	public void setType(SensorType sensorType) {
		this.type =sensorType;
	}

	/**
	 * 
	 * @param sensorGroup
	 */
	public void setGroup(SensorGroup sensorGroup) {
		this.group=sensorGroup;
	}

	public Sensor() {
	
	}

	/**
	 * 
	 * @param publicID
	 * @param marca
	 */
	public Sensor(String publicID, String marca, SensorGroup group) {
		this.publicID = publicID;
		this.brand=marca;
		this.group= group;
		this.type=group.getType();
	}

	public String getPublicID() {
		return this.publicID;
	}

	public int getInternalID() {
		return this.internalID;
	}

	/**
	 * 
	 * @param internalID
	 */
	public void setInternalID(int internalID) {
		this.internalID = internalID;
	}

	public String getBrand() {
		return this.brand;
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

}