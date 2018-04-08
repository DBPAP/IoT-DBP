package com.DBP.IoT.businessCore.sensorSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SensorSystem {

	private static SensorSystem instance;
	
	private   List<Sensor> sensors;
	private   List<SensorGroup> sensorGoups ;
	private   List<SensorType> sensorsTypes;
	

	/**
	 * 
	 * @param PublicID
	 */
	public void removeSensor(String PublicID) {
		for(Sensor s:sensors){
			if(s.getPublicID() == PublicID) {
				sensors.remove(s);
			}
			
		}
	}

	public static SensorSystem getIstance() {
		if (instance==null) {
			
			instance = new SensorSystem();
			}
			return instance;
	}

	private SensorSystem() {
		this.sensors = new ArrayList<Sensor>();
		sensorGoups = new ArrayList<SensorGroup>();
		sensorsTypes = new ArrayList<SensorType>();
	}
	/**
	 * 
	 * @param publicID
	 */
	public void getSensorByPublicID(String publicID) {
		for(Sensor s:sensors){
			if(s.getPublicID() == publicID) {
				sensors.remove(s);
			}
		}
	}

	/**
	 * 
	 * @param sensor
	 */
	public void insertSensor(Sensor sensor) {
		sensors.add(sensor);
	}

	/**
	 * 
	 * @param type
	 */
	public void insertType(SensorType type) {
		sensorsTypes.add(type);
	}

	/**
	 * 
	 * @param group
	 */
	public void insertGroup(SensorGroup group) {
		sensorGroup.add()
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