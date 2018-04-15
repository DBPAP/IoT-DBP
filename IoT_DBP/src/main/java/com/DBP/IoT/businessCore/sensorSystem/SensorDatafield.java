package com.DBP.IoT.businessCore.sensorSystem;

import javax.persistence.Column;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name="sensorDataField")
class SensorDataField {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="cipherLength")
	private int cipherLength;
	@Column(name ="type")
	private String type;
	@Column(name ="name")
	private String name;

	 SensorDataField() {
		
	}

	/**
	 * 
	 * @param name
	 * @param type
	 * @param length
	 */
	 SensorDataField(String name, String type, int cipherLength) {
		this.name=name;
		this.type=type;
		this.cipherLength=cipherLength;
	}

	

	public int getCipherLength() {
		return this.cipherLength;
	}

	/**
	 * 
	 * @param cipherLength
	 */
	public void setCipherLength(int cipherLength) {
		this.cipherLength = cipherLength;
	}

	public String getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

}