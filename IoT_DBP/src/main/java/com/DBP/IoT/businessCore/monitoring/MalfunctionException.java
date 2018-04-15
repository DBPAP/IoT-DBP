package com.DBP.IoT.businessCore.monitoring;
public class MalfunctionException extends SensorException {

	private int sensorID;
	private int errorCode;
	private String description;

	public int getSensorID() {
		return this.sensorID;
	}

	/**
	 * 
	 * @param sensorID
	 */
	public void setSensorID(int sensorID) {
		this.sensorID = sensorID;
	}

	public int getErrorCode() {
		return this.errorCode;
	}

	/**
	 * 
	 * @param errorCode
	 */
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	public MalfunctionException() {
		// TODO - implement MalfunctionException.MalfunctionException
		throw new UnsupportedOperationException();
	}

}