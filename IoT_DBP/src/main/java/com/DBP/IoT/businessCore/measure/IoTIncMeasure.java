package businessCore.measure;

import string;
import Collection;
import LocalDateTime;
import BigDecimal;

public class IoTIncMeasure implements Measure {

	private int internalID;
	private string sensorPublicID;
	private string description;
	private Collection measureDetails;
	private LocalDateTime timestamp;
	private String sensorGroup;
	private String type;

	public IoTIncMeasure() {
		// TODO - implement IoTIncMeasure.IoTIncMeasure
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sensorID
	 * @param description
	 * @param measureDetails
	 */
	public IoTIncMeasure(string sensorID, string description, Collection measureDetails) {
		// TODO - implement IoTIncMeasure.IoTIncMeasure
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement IoTIncMeasure.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement IoTIncMeasure.setID
		throw new UnsupportedOperationException();
	}

	public string getSensorPublicID() {
		return this.sensorPublicID;
	}

	/**
	 * 
	 * @param sensorPublicID
	 */
	public void setSensorPublicID(string sensorPublicID) {
		this.sensorPublicID = sensorPublicID;
	}

	public string getDescription() {
		return this.description;
	}

	/**
	 * 
	 * @param description
	 */
	public void setDescription(string description) {
		this.description = description;
	}

	public Collection getMeasureDetails() {
		return this.measureDetails;
	}

	/**
	 * 
	 * @param measureDetails
	 */
	public void setMeasureDetails(Collection measureDetails) {
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
		// TODO - implement IoTIncMeasure.getMeasuredValue
		throw new UnsupportedOperationException();
	}

}