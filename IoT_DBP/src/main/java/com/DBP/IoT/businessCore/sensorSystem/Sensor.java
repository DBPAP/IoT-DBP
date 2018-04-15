package com.DBP.IoT.businessCore.sensorSystem;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="sensor")
class Sensor {
	@Id
	@GeneratedValue
	private int internalID;
	@Column(name="publicId")
	private String publicID;
	@Column(name="brand")
	private String brand;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="groupIdentifier")
	private SensorType type;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sensorTypeIdentifier")
	private SensorGroup group;

	public SensorType getType() {
		return this.type;
	}

	public SensorGroup getGroup() {
		return this.group;
	}

	/**
	 * 
	 * @param publicId
	 */
	public void setPublicID(String publicId) {
		this.publicID=publicId;
	}

	/**
	 * 
	 * @param sensorType
	 */
	public void setType(SensorType sensorType) {
		this.type =sensorType;
	}

	/**
	 * 
	 * @param sensorGroup
	 */
	public void setGroup(SensorGroup sensorGroup) {
		this.group=sensorGroup;
	}

	Sensor() {
	
	}

	/**
	 * 
	 * @param publicID
	 * @param marca
	 */
	Sensor(String publicID, String marca, SensorGroup group) {
		this.publicID = publicID;
		this.brand=marca;
		this.group= group;
		this.type=group.getType();
	}

	public String getPublicID() {
		return this.publicID;
	}

	public int getInternalID() {
		return this.internalID;
	}

	/**
	 * 
	 * @param internalID
	 */
	public void setInternalID(int internalID) {
		this.internalID = internalID;
	}

	public String getBrand() {
		return this.brand;
	}

	/**
	 * 
	 * @param brand
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}

}