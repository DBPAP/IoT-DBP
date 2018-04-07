package businessCore.sensorSystem;

import string;

class SensorDataField {

	private int ID;
	private int cipherLength;
	private string type;
	private string name;

	public SensorDataField() {
		// TODO - implement SensorDataField.SensorDataField
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param name
	 * @param type
	 * @param length
	 */
	public SensorDataField(string name, string type, int length) {
		// TODO - implement SensorDataField.SensorDataField
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement SensorDataField.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement SensorDataField.setID
		throw new UnsupportedOperationException();
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

	public string getType() {
		return this.type;
	}

	/**
	 * 
	 * @param type
	 */
	public void setType(string type) {
		this.type = type;
	}

	public string getName() {
		return this.name;
	}

	/**
	 * 
	 * @param name
	 */
	public void setName(string name) {
		this.name = name;
	}

}