package businessCore.monitoring;

import ValueRisk;

public class ValueRiskException extends SensorException {

	private int measureID;
	private ValueRisk risk;

	public ValueRisk getRisk() {
		return this.risk;
	}

	/**
	 * 
	 * @param risk
	 */
	public void setRisk(ValueRisk risk) {
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