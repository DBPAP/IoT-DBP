package com.DBP.IoT.businessCore.sensorSystem;



import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="sensorType")
class SensorType {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="sensorTypeIdentifier")
	private String sensorTypeIdentifier;
	@Column(name="measureUnit")
	private String measureUnit;
	@OneToMany(mappedBy="name")
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
	 * @param id
	 */
	public void setId(int id) {
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