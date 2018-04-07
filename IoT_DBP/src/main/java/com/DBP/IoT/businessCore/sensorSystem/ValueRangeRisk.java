package com.DBP.IoT.businessCore.sensorSystem;


public class ValueRangeRisk {

	private int ID;
	private EnumScale risk;
	private Int GroupID;
	private ValueRange range;

	/**
	 * 
	 * @param range
	 */
	public void setRange(ValueRange range) {
		// TODO - implement ValueRangeRisk.setRange
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param risk
	 */
	public void setRisk(EnumScale risk) {
		this.risk = risk;
	}

	/**
	 * 
	 * @param start
	 * @param end
	 * @param risk
	 */
	public ValueRangeRisk(double start, double end, EnumScale risk) {
		// TODO - implement ValueRangeRisk.ValueRangeRisk
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param value
	 */
	public boolean isIn(double value) {
		// TODO - implement ValueRangeRisk.isIn
		throw new UnsupportedOperationException();
	}

	public void getRange() {
		// TODO - implement ValueRangeRisk.getRange
		throw new UnsupportedOperationException();
	}

	public ValueRangeRisk() {
		// TODO - implement ValueRangeRisk.ValueRangeRisk
		throw new UnsupportedOperationException();
	}

	public int getID() {
		// TODO - implement ValueRangeRisk.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement ValueRangeRisk.setID
		throw new UnsupportedOperationException();
	}

	public EnumScale getRisk() {
		return this.risk;
	}

}