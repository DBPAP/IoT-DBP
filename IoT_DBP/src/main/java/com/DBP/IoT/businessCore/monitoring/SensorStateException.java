package businessCore.monitoring;

public class SensorStateException extends SensorException {

	private int sensorID;

	public void getSensorID() {
		// TODO - implement SensorStateException.getSensorID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sensorID
	 */
	public void setSensorID(int sensorID) {
		this.sensorID = sensorID;
	}

	public SensorStateException() {
		// TODO - implement SensorStateException.SensorStateException
		throw new UnsupportedOperationException();
	}

}