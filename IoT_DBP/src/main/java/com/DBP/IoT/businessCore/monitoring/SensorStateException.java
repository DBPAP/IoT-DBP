package com.DBP.IoT.businessCore.monitoring;



public class SensorStateException extends SensorException {

	private int sensorID;

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

	public SensorStateException() {
		
	}

}