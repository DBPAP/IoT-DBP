package com.DBP.IoT.businessCore.monitoring;


/**
 * classe che gestisce lo stato dei sensori
 * @author Alessandro
 *
 */
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