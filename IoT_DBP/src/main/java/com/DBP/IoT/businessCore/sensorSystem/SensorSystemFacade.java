package com.DBP.IoT.businessCore.sensorSystem;

//import IoTIncSensorDetail;

public class SensorSystemFacade {

	/**
	 * 
	 * @param publicID
	 */
	public SensorType getSensorTypeByPublicID(String publicID) {
		SensorSystem s = SensorSystem.getIstance();
		return s.getSensorByPublicID(publicID).getType();
	
	}

	/**
	 * 
	 * @param information
	 */
	public void setSystemInformation(SensorSystemInformation information) {
		// TODO - implement SensorSystemFacade.setSystemInformation
		throw new UnsupportedOperationException();
	}

	public SensorSystemInformation getSystemInformation() {
		// TODO - implement SensorSystemFacade.getSystemInformation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param publicID
	 *
	public IoTIncSensorDetail getSensorDetailByPublicID(String publicID) {
		// TODO - implement SensorSystemFacade.getSensorDetailByPublicID
		throw new UnsupportedOperationException();
	}
	*/

	/**
	 * 
	 * @param group
	 * @param start
	 * @param end
	 * @param risk
	 */
	public void setValueRangeRisk(SensorGroup group, double start, double end, EnumScale risk) {
		
		// TODO - implement SensorSystemFacade.setValueRangeRisk
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param sensorPublicID
	 */
	public SensorGroup getGroupByPublicID(String sensorPublicID) {
		// TODO - implement SensorSystemFacade.getGroupByPublicID
		throw new UnsupportedOperationException();
	}

	public void operation() {
		// TODO - implement SensorSystemFacade.operation
		throw new UnsupportedOperationException();
	}

}