package com.DBP.IoT.businessCore.sensorSystem;



import java.util.*;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="sensorGroup")
class SensorGroup {
	@Id
	@GeneratedValue
	private int internalId;
	@Column(name="groupIdentifier")
	private String groupIdentifier;
	@Column(name="position")
	private String position;
	@OneToMany(mappedBy="internalId")
	private List<ValueRangeRisk> valueRanges = new ArrayList<ValueRangeRisk>();
	@OneToMany(mappedBy="group")
	private List<Sensor> sensors = new ArrayList<Sensor>();
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="sensorTypeIdentifier")
	private SensorType type;
	

	/**
	 * 
	 * @param start
	 * @param end
	 * @param risk
	 */
	public void insertValueRange(ValueRangeRisk valueRange) {
		valueRanges.add(valueRange);
		
	}
	

	/**
	 * 
	 * @param position
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	public boolean hasValueRange() {
		return !(this.valueRanges.isEmpty());
	}

	public List<Sensor> getSensors() {
		return this.sensors;
	}

	/**
	 * 
	 * @param value
	 */
	public IoTIncHazardScale getValueRisk(double value) {

		if (this.hasValueRange()) {
			for(ValueRangeRisk range : this.valueRanges) {
				if (range.isIn(value)) {
					return range.getRisk();
				}

			}
		}
		throw new UnsupportedOperationException();
	}

	 SensorGroup() {
	
	}

	/**
	 * 
	 * @param groupIdentifier
	 * @param position
	 * @param type
	 */
	 SensorGroup(String groupIdentifier, String position, SensorType type) {

		this.groupIdentifier=groupIdentifier;
		this.position=position;
		this.type=type;

	}

	
	public int getInternalId() {
		return this.internalId;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setInternalId(int id) {
		this.internalId=id;
	}

	/**public ValueRange getValueRange() {
		return
	}**/

	public String getGroupIdentifier() {
		return this.groupIdentifier;
	}

	/**
	 * 
	 * @param groupIdentifier
	 */
	public void setGroupIdentifier(String groupIdentifier) {
		this.groupIdentifier = groupIdentifier;
	}

	public String getPosition() {
		return this.position;
	}

	/**
	 * 
	 * @param sensors
	 */
	public void setSensors(List<Sensor> sensors) {
		this.sensors=sensors;
	}

	public SensorType getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(SensorType type) {
		this.type=type;
	}

}