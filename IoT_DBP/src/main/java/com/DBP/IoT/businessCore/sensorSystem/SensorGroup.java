package com.DBP.IoT.businessCore.sensorSystem;



import java.util.*;



class SensorGroup {

	private int internalId;
	private String groupIdentifier;
	private SensorGroupToPosition position;
	private List<ValueRangeRisk> valueRanges = new ArrayList<ValueRangeRisk>();
	private List<Sensor> sensors = new ArrayList<Sensor>();
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
	public void setPosition(SensorGroupToPosition position) {
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
	public EnumScale getValueRisk(double value) {
<<<<<<< HEAD
		EnumScale risk = IoTIncHazardScale.NONE;
		Iterator iter = this.valueRanges.iterator();
		for(ValueRangeRisk range : this.valueRanges) {
			if (range.isIn(value)) {
				
=======
		if (this.hasValueRange()) {
			for(ValueRangeRisk range : this.valueRanges) {
				if (range.isIn(value)) {
					return range.getRisk();
				}
>>>>>>> refs/remotes/origin/master
			}
		}
		throw new UnsupportedOperationException();
	}

	public SensorGroup() {
	
	}

	/**
	 * 
	 * @param groupIdentifier
	 * @param position
	 * @param type
	 */
	public SensorGroup(String groupIdentifier, SensorGroupToPosition position, SensorType type) {
<<<<<<< HEAD
		// TODO - implement SensorGroup.SensorGroup
		throw new UnsupportedOperationException();
=======
		this.groupIdentifier=groupIdentifier;
		this.position=position;
		this.type=type;
>>>>>>> refs/remotes/origin/master
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

	public SensorGroupToPosition getPosition() {
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