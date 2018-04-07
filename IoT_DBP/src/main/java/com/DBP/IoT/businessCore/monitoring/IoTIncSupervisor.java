package businessCore.monitoring;

import businessCore.sensorSystem.EnumScale;
import businessCore.measure.IoTIncMeasure;
import businessCore.measure.Measure;

public class IoTIncSupervisor extends Supervisor {

	private int checkFrequency;
	private EnumScale riskScale;
	private static IoTIncSupervisor istance;

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
		return this.istance;
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

	public EnumScale getRiskScale() {
		return this.riskScale;
	}

	/**
	 * 
	 * @param riskScale
	 */
	public void setRiskScale(EnumScale riskScale) {
		this.riskScale = riskScale;
	}

}