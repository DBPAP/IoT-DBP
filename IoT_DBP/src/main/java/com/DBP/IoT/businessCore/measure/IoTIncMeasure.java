package com.DBP.IoT.businessCore.measure;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class IoTIncMeasure implements Measure {
	private BigDecimal measuredValue;
	private int internalID;
	private String sensorPublicID;
	private String description;
	private Measure measureDetails;
	private LocalDateTime timestamp;
	private String sensorGroup;
	private String type;

	public IoTIncMeasure() {
		
	}

	/**
	 * 
	 * @param sensorID
	 * @param description
	 * @param measureDetails
	 */
	public IoTIncMeasure(String sensorID, String description, Measure measureDetails) {
		// TODO - implement IoTIncMeasure.IoTIncMeasure
		throw new UnsupportedOperationException();
	}

	public int getID() {
		return this.internalID;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int id) {
		this.internalID=id;
	}

	public String getSensorPublicID() {
		return this.sensorPublicID;
	}

	/**
	 * 
	 * @param sensorPublicID
	 */
	public void setSensorPublicID(String sensorPublicID) {
		this.sensorPublicID = sensorPublicID;
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

	public Measure getMeasureDetails() {
		return this.measureDetails;
	}

	/**
	 * 
	 * @param measureDetails
	 */
	public void setMeasureDetails(Measure measureDetails) {
		this.measureDetails = measureDetails;
	}

	public LocalDateTime getTimestamp() {
		return this.timestamp;
	}

	/**
	 * 
	 * @param timestamp
	 */
	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getSensorGroup() {
		return this.sensorGroup;
	}

	/**
	 * 
	 * @param sensorGroup
	 */
	public void setSensorGroup(String sensorGroup) {
		this.sensorGroup = sensorGroup;
	}

	public BigDecimal getMeasuredValue() {
		return this.measuredValue;
	}

	/**
	 * @return the internalID
	 */
	public int getInternalID() {
		return internalID;
	}

	/**
	 * @param internalID the internalID to set
	 */
	public void setInternalID(int internalID) {
		this.internalID = internalID;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

}