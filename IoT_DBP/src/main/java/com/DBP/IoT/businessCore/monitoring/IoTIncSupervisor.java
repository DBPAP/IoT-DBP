package com.DBP.IoT.businessCore.monitoring;


import com.DBP.IoT.businessCore.measure.IoTIncMeasure;
import com.DBP.IoT.businessCore.measure.Measure;
import com.DBP.IoT.businessCore.sensorSystem.IoTIncHazardScale;
import com.DBP.IoT.businessCore.sensorSystem.SensorSystem;
public class IoTIncSupervisor implements Supervisor {

	private int checkFrequency;
	private IoTIncHazardScale riskScale;
	private static IoTIncSupervisor instance;

	/**
	 * 
	 * @param measure
	 */
	private void checkMulfanctionError(IoTIncMeasure measure) {
		// TODO - implement IoTIncSupervisor.checkMulfanctionError
		throw new UnsupportedOperationException();
	}

	void systemCheckUp() {
		// TODO - implement IoTIncSupervisor.systemCheckUp
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param measure
	 */
	void checkMeasure(Measure measure) {
		// TODO - implement IoTIncSupervisor.checkMeasure
		throw new UnsupportedOperationException();
	}

	public static IoTIncSupervisor getIstance() {
		if (IoTIncSupervisor.instance==null) {
			instance = new IoTIncSupervisor();
			}
			return IoTIncSupervisor.instance;
	}

	private void SuperVisor() {
		// TODO - implement IoTIncSupervisor.SuperVisor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param measure
	 */
	public void checkValueRisk(Measure measure) {
		// TODO - implement IoTIncSupervisor.checkValueRisk
		throw new UnsupportedOperationException();
	}

	public int getCheckFrequency() {
		return this.checkFrequency;
	}

	/**
	 * 
	 * @param checkFrequency
	 */
	public void setCheckFrequency(int checkFrequency) {
		this.checkFrequency = checkFrequency;
	}

	public IoTIncHazardScale getRiskScale() {
		return this.riskScale;
	}

	/**
	 * 
	 * @param riskScale
	 */
	public void setRiskScale(IoTIncHazardScale riskScale) {
		this.riskScale = riskScale;
	}

}