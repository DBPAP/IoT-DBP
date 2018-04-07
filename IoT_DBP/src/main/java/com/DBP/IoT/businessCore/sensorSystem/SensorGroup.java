package businessCore.sensorSystem;

import string;
import Collection;

class SensorGroup {

	private int ID;
	private string groupIdentifier;
	private SensorGroupToPosition position;

	/**
	 * 
	 * @param start
	 * @param end
	 * @param risk
	 */
	public void setValueRange(double start, double end, EnumScale risk) {
		// TODO - implement SensorGroup.setValueRange
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param position
	 */
	public void setPosition(SensorGroupToPosition position) {
		this.position = position;
	}

	public boolean hasValueRange() {
		// TODO - implement SensorGroup.hasValueRange
		throw new UnsupportedOperationException();
	}

	public Collection<Sensor> getSensors() {
		// TODO - implement SensorGroup.getSensors
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param value
	 */
	public EnumScale getValueRisk(double value) {
		// TODO - implement SensorGroup.getValueRisk
		throw new UnsupportedOperationException();
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