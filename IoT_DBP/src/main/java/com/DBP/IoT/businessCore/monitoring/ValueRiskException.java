package com.DBP.IoT.businessCore.monitoring;

import com.DBP.IoT.businessCore.sensorSystem.IoTIncHazardScale;



public class ValueRiskException extends SensorException {

	private int measureID;
	private IoTIncHazardScale risk;

	public IoTIncHazardScale getRisk() {
		return this.risk;
	}

	/**
	 * 
	 * @param risk
	 */
	public void setRisk(IoTIncHazardScale risk) {
		this.risk = risk;
	}

	public int getMeasureID() {
		return this.measureID;
	}

	/**
	 * 
	 * @param measureID
	 */
	public void setMeasureID(int measureID) {
		this.measureID = measureID;
	}

	public ValueRiskException() {
		// TODO - implement ValueRiskException.ValueRiskException
		throw new UnsupportedOperationException();
	}

}