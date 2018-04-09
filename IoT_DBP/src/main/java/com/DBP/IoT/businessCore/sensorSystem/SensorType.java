package com.DBP.IoT.businessCore.sensorSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.util.List;




class SensorType {

	private int id;
	private String sensorTypeIdentifier;
	private String measureUnit;
	private List<SensorDataField> sensorFormat;
	

		
	public SensorType() {
		
	}
	public SensorType(String sensorTypeIdentifier,String measureUnit,List<SensorDataField> sensorFormat ) {
		this.sensorFormat=sensorFormat;
		this.sensorTypeIdentifier=sensorTypeIdentifier;
		this.measureUnit=measureUnit;
		
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

	public int getId() {
		return this.id;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setId(int ID) {
		this.id=id;
	}

	public String getSensorTypeIdentifier() {
		return this.sensorTypeIdentifier;
	}

	/**
	 * 
	 * @param sensorTypeIdentifier
	 */
	public void setSensorTypeIdentifier(String sensorTypeIdentifier) {
		this.sensorTypeIdentifier = sensorTypeIdentifier;
	}

	/**
	 * @param sensorFormat the sensorFormat to set
	 */
	public void setSensorFormat(List<SensorDataField> sensorFormat) {
		this.sensorFormat = sensorFormat;
	}
	public List<SensorDataField> setSensorFormat() {
		return this.sensorFormat ;
	}
	

}