package com.DBP.IoT.businessCore.sensorSystem;





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
	 * @param publicID
	 */
	public  Sensor getSensorDetailByPublicID(String publicID) {
		SensorSystem s=SensorSystem.getIstance();
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

	public void setValueRangeRisk(SensorGroup group, double start, double end, IoTIncHazardScale risk) {
		
		group.insertValueRange(new ValueRangeRisk(start,end,risk,group.getGroupIdentifier()));

	}

	/**
	 * 
	 * @param sensorPublicID
	 */
	public SensorGroup getGroupByPublicID(String sensorPublicID) {
		SensorSystem s=SensorSystem.getIstance();
		Sensor sen=s.getSensorByPublicID(sensorPublicID);
		return sen.getGroup();
	}

	public void operation() {
		// TODO - implement SensorSystemFacade.operation
		throw new UnsupportedOperationException();
	}

}