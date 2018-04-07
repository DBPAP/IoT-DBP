package businessCore.sensorSystem;

import string;

class Sensor {

	private int internalID;
	private String publicID;
	private string brand;

	public SensorType getType() {
		// TODO - implement Sensor.getType
		throw new UnsupportedOperationException();
	}

	public SensorGroup getGroup() {
		// TODO - implement Sensor.getGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setPublicID(string ID) {
		// TODO - implement Sensor.setPublicID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sensorType
	 */
	public void setType(SensorType sensorType) {
		// TODO - implement Sensor.setType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sensorGroup
	 */
	public void setGroup(SensorGroup sensorGroup) {
		// TODO - implement Sensor.setGroup
		throw new UnsupportedOperationException();
	}

	public Sensor() {
		// TODO - implement Sensor.Sensor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 * @param marca
	 */
	public Sensor(string ID, string marca) {
		// TODO - implement Sensor.Sensor
		throw new UnsupportedOperationException();
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

	public string getBrand() {
		return this.brand;
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(string brand) {
		this.brand = brand;
	}

}