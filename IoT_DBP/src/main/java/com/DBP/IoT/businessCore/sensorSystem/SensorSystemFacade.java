package com.DBP.IoT.businessCore.sensorSystem;

import java.util.EnumSet;

public class SensorSystemFacade {
	private SensorSystem s;
	/**
	 * 
	 * @param publicID
	 */
	public SensorType getSensorTypeByPublicID(String publicID) {
		s=SensorSystem.getIstance();
		SensorType sensor = s.getSensorTypeByPublicID(publicID);
		return sensor;
		
		
	}

	/**
	 * 
	 * @param information
	 */
	

	/**
	 * 
	 * @param publicID
	 */
	public  Sensor getSensorDetailByPublicID(String publicID) {
		s=SensorSystem.getIstance();
		Sensor sensor=s.getSensorByPublicID(publicID);
	
		return sensor;
		
	}

	/**
	 * 
	 * @param group
	 * @param start
	 * @param end
	 * @param risk
	 */
	public void setValueRangeRisk(SensorGroup group, double start, double end, EnumSet<IoTIncHazardScale> risk) {
		
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