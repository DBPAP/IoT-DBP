package com.DBP.IoT.businessCore.sensorSystem;

import java.util.Iterator;
import java.util.List;

public class SensorSystem {

	private static SensorSystem instance;
	
	private  List<Sensor> sensorsRunned;
	private  List<SensorGroup> sensorGoupsRunned;
	
	

	/**
	 * 
	 * @param PublicID
	 */
	public void removeSensor(String PublicID) {
		for(Sensor s:sensorsRunned){
			if(s.getPublicID() == PublicID) {
				sensorsRunned.remove(s);
			}
			
		}
	}

	public static SensorSystem getIstance() {
		// TODO - implement SensorSystem.getIstance
		throw new UnsupportedOperationException();
	}

	private SensorSystem() {
		// TODO - implement SensorSystem.SensorSystem
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param publicID
	 */
	public void getSensorByPublicID(String publicID) {
		// TODO - implement SensorSystem.getSensorByPublicID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sensor
	 */
	public void insertSensor(Sensor sensor) {
		// TODO - implement SensorSystem.insertSensor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 */
	public void insertType(SensorType type) {
		// TODO - implement SensorSystem.insertType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param group
	 */
	public void insertGroup(SensorGroup group) {
		// TODO - implement SensorSystem.insertGroup
		throw new UnsupportedOperationException();
	}

	public void removeGroup() {
		// TODO - implement SensorSystem.removeGroup
		throw new UnsupportedOperationException();
	}

	public void removeType() {
		// TODO - implement SensorSystem.removeType
		throw new UnsupportedOperationException();
	}

}