package businessCore.sensorSystem;

import string;
import Collection;
import FormatType;

class SensorType {

	private int ID;
	private string sensorTypeIdentifier;
	private Collection malfunctionCodes;
	private String measureUnit;

	public FormatType getFormat() {
		// TODO - implement SensorType.getFormat
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param format
	 */
	public void setFormat(Collection format) {
		// TODO - implement SensorType.setFormat
		throw new UnsupportedOperationException();
	}

	public void IoTIncSensorType() {
		// TODO - implement SensorType.IoTIncSensorType
		throw new UnsupportedOperationException();
	}

	public Collection getMalfunctionCodes() {
		return this.malfunctionCodes;
	}

	/**
	 * 
	 * @param malfunctionCodes
	 */
	public void setMalfunctionCodes(Collection malfunctionCodes) {
		this.malfunctionCodes = malfunctionCodes;
	}

	public String getMeasureUnit() {
		return this.measureUnit;
	}

	/**
	 * 
	 * @param measureUnit
	 */
	public void setMeasureUnit(String measureUnit) {
		this.measureUnit = measureUnit;
	}

	public int getID() {
		// TODO - implement SensorType.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement SensorType.setID
		throw new UnsupportedOperationException();
	}

	public string getSensorTypeIdentifier() {
		return this.sensorTypeIdentifier;
	}

	/**
	 * 
	 * @param sensorTypeIdentifier
	 */
	public void setSensorTypeIdentifier(string sensorTypeIdentifier) {
		this.sensorTypeIdentifier = sensorTypeIdentifier;
	}

}