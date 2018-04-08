package com.DBP.IoT.businessCore.sensorSystem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SensorSystem {

	private static SensorSystem instance;
	
	private   List<Sensor> sensors;
	private   List<SensorGroup> sensorGroups ;
	private   List<SensorType> sensorTypes;
	

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
		sensorGroups = new ArrayList<SensorGroup>();
		sensorTypes = new ArrayList<SensorType>();
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
		if(!ifExistSensor(sensor)) {
			sensors.add(sensor);
		}else{
			throw new  IllegalArgumentException("Sensor Esistente");
		}
	}
	/**
	 * 
	 * @param sensor
	 * @return true se il sensore è presente nella collezione
	 */
	private boolean ifExistSensor(Sensor sensor) {
		for(Sensor s:sensors){
			if(s.getPublicID().equals(sensor.getPublicID())) {
				return true;
			}	
		}
		return false;
	}
	/**
	 * 
	 * @param group
	 * @return true se il gruppo è presente nella collezione
	 */
	private boolean ifExistGruop(SensorGroup group) {
		for(SensorGroup g:sensorGroups){
			if(g.getGroupIdentifier().equals(group.getGroupIdentifier())) {
				return true;
			}	
		}
		return false;
	}
	/**
	 * 
	 * @param type
	 * @return
	 */
	private boolean ifExistType(SensorType type) {
		for(SensorType t:sensorTypes){
			if(t.getSensorTypeIdentifier().equals(type.getSensorTypeIdentifier())) {
				return true;
			}	
		}
		return false;
	}
	/**
	 * 
	 * @param type
	 */
	public void insertType(SensorType type) {
		if(!ifExistType(type)) {
			sensorTypes.add(type);
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
		if(!ifExistGruop(group)) {
			sensorGroups.add(group);
		}else {
			//da modificare
			throw new  IllegalArgumentException("Gruppo già esistente");
		}
	}
	
	private void removeSensorsByGroupId(String groupId) {
		for(Sensor s:sensors){
			if(s.getGroup().getGroupIdentifier().equals(groupId)) {
				sensors.remove(s);
				break;
			}	
		}
	}
	private boolean checkGroup(String groupId) {
		for(SensorGroup g:sensorGroups){
			if(g.getGroupIdentifier().equals(groupId)) {
				return true;			
			}
		
		}
		return false;
	}
		
	public void removeGroup(String groupId) {
		if(checkGroup(groupId)) {
			removeSensorsByGroupId( groupId);
			for(SensorGroup g:sensorGroups){
				if(g.getGroupIdentifier().equals(groupId)) {
					sensorGroups.remove(g);
				}
			}
		}else{
			//da modificare
			throw new  IllegalArgumentException("Gruppo Non Esistente");
		}
	}
	/**
	 * @return false se esiste un gruppo associato al tipo
	 */
	private boolean checkSensorTypeToGruoup(String typeId){
		for(SensorGroup g:sensorGroups){
			if(g.getType().getSensorTypeIdentifier().equals(typeId)) {
				return false;
			}
		}
	return true;	
	}
	public void removeType(String typeId) {
		if(checkSensorTypeToGruoup(typeId)){
			for(SensorType t:sensorTypes){
				if(t.getSensorTypeIdentifier().equals(typeId)) {
					sensorTypes.remove(t);
				}
			}
		}else{
				//da modificare
			throw new  IllegalArgumentException("Gruppo Non Esistente");
		}
			
	}
}

