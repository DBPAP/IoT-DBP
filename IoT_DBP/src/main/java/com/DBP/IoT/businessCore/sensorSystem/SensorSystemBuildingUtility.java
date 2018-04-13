package com.DBP.IoT.businessCore.sensorSystem;

import java.util.List;

class SensorSystemBuildingUtility {

	/**
	 * 
	 * @param publicId
	 * @param brand
	 * @param group
	 */
	public Sensor buildSensor(String publicId, String brand, SensorGroup group) {
		Sensor sensor = new Sensor(publicId,brand,group);
		
		return sensor;
		
			
	}

	/**
	 * 
	 * @param type
	 * @param identifier
	 * @param position
	 */
	public SensorGroup buildSensorGroup(SensorType type, String identifier, String position) {
		SensorGroup group= new SensorGroup(identifier,position,type);
		return group;
	}

	/**
	 * 
	 * @param identifier
	 * @param um
	 * @param formatDetails
	 */
	public SensorType buildSensorType(String sensorTypeIdentifier,String measureUnit,List<SensorDataField> sensorFormat) {
		SensorType type= new SensorType( sensorTypeIdentifier,measureUnit, sensorFormat );
		return type;
		
	}

}