package com.DBP.IoT.businessCore.sensorSystem;



import java.util.*;



class SensorGroup {

	private int id;
	private String groupIdentifier;
	private SensorGroupToPosition position;
	private List<ValueRangeRisk> valueRanges = new ArrayList<ValueRangeRisk>();
	private List<Sensor> sensors = new ArrayList<Sensor>();
	

	/**
	 * 
	 * @param start
	 * @param end
	 * @param risk
	 */
	public void setValueRange(ValueRangeRisk valueRange) {
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
		return this.valueRanges.isEmpty();
	}

	public List<Sensor> getSensors() {
		return this.sensors;
	}

	/**
	 * 
	 * @param value
	 */
	public EnumScale getValueRisk(double value) {
		EnumScale risk = HazardScale.NONE;
		Iterator iter = this.valueRanges.iterator();
		for(ValueRangeRisk range : this.valueRanges) {
			if (range.isIn(value)) {
				
			}
		}
		return risk;
	}

	public SensorGroup() {
		// TODO - implement SensorGroup.SensorGroup
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param groupIdentifier
	 * @param position
	 * @param type
	 */
	public SensorGroup(string groupIdentifier, SensorGroupToPosition position, SensorType type) {
		// TODO - implement SensorGroup.SensorGroup
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement SensorGroup.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement SensorGroup.setID
		throw new UnsupportedOperationException();
	}

	public ValueRange getValueRange() {
		// TODO - implement SensorGroup.getValueRange
		throw new UnsupportedOperationException();
	}

	public string getGroupIdentifier() {
		return this.groupIdentifier;
	}

	/**
	 * 
	 * @param groupIdentifier
	 */
	public void setGroupIdentifier(string groupIdentifier) {
		this.groupIdentifier = groupIdentifier;
	}

	public SensorGroupToPosition getPosition() {
		return this.position;
	}

	/**
	 * 
	 * @param sensors
	 */
	public void setSensors(Collection sensors) {
		// TODO - implement SensorGroup.setSensors
		throw new UnsupportedOperationException();
	}

	public SensorType getType() {
		// TODO - implement SensorGroup.getType
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(SensorType type) {
		// TODO - implement SensorGroup.setType
		throw new UnsupportedOperationException();
	}

}