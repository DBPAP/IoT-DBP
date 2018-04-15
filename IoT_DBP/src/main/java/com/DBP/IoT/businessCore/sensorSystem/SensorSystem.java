package com.DBP.IoT.businessCore.sensorSystem;

import java.util.ArrayList;
import java.util.HashMap;

import java.util.Map;

public class SensorSystem {

	private static SensorSystem instance=null;
	
	private   Map<String,Sensor> sensors= new HashMap<String,Sensor>();
	private   Map<String,SensorGroup> sensorGroups = new HashMap<String,SensorGroup>();
	private   Map<String,SensorType> sensorTypes=new HashMap<String,SensorType>();
	
	/**
	 * 
	 * @param PublicID
	 */
	public void removeSensor(String PublicID) {
			sensors.remove(PublicID);
	}

	public static SensorSystem getIstance() {


		if (SensorSystem.instance==null) {
			instance = new SensorSystem();
			}
			return SensorSystem.instance;
			
	}

	private SensorSystem() {
		
	}
	

	/**
	 * 
	 * @param publicID
	 * @return 
	 */

	public Sensor getSensorByPublicID(String publicID) {

		return sensors.get(publicID);
	}

	/**
	 * 
	 * @param sensor
	 */
	public void insertSensor(Sensor sensor) {
		if(!sensors.containsKey(sensor.getPublicID())) {
			sensors.put(sensor.getPublicID(),sensor);
		}else{
			throw new  IllegalArgumentException("Sensor Esistente");
		}
	}
	
	/**
	 * 
	 * @param type
	 */
	public void insertType(SensorType type) {
		if(!sensorTypes.containsKey(type.getSensorTypeIdentifier())) {
			sensorTypes.put(type.getSensorTypeIdentifier(),type);
		}else {
			//da modificare
			throw new  IllegalArgumentException("Tipo già esistente");
		}
		
	}

	/**
	 * 
	 * @param group
	 */
	public void insertGroup(SensorGroup group) {
		if(!sensorGroups.containsKey(group.getGroupIdentifier())) {
			sensorGroups.put(group.getGroupIdentifier(),group);
		}else {
			//da modificare
			throw new  IllegalArgumentException("Gruppo già esistente");
		}
	}
	
	
	
		
	public void removeGroup(String groupId) {
		if(sensorGroups.containsKey(groupId)){
			ArrayList<Sensor> sen= (ArrayList<Sensor>)sensors.values();
			for(Sensor s : sen) {
				if(s.getGroup().getGroupIdentifier().equals(groupId)) {
				sensors.remove(s.getPublicID());
				}
			}		
			sensorGroups.remove(groupId);
		} else{
			//da modificare
			throw new  IllegalArgumentException("Gruppo Non Esistente");
		}
	}
	
	/**
	 * @return false se esiste un gruppo associato al tipo
	 */
	
	public void removeType(String typeId) {
		if (sensorTypes.containsKey(typeId)){
			ArrayList<SensorGroup> group= (ArrayList<SensorGroup>)sensorGroups.values();
			for(SensorGroup g : group) {
				if(g.getType().getSensorTypeIdentifier().equals(typeId)) {
					throw new  IllegalArgumentException("tipo utilizzato da altri gruppi");
				}
			}
			sensorTypes.remove(typeId);
		}else{
				//da modificare
			throw new  IllegalArgumentException("Gruppo Non Esistente");
		}
			
	}

	public SensorType getSensorTypeByPublicID(String publicID) {
		return sensorTypes.get(publicID);
	}

	
}

