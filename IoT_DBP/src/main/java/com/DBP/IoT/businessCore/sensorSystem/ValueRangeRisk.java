package com.DBP.IoT.businessCore.sensorSystem;


public class ValueRangeRisk {

	private int id;
	private EnumScale risk;
	private int GroupID;
	private ValueRange range;

	/**
	 * 
	 * @param range
	 */
	public void setRange(ValueRange range) {
		this.range=range;
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
	 * @param value
	 */
	public boolean isIn(double value) {
		double start = this.range.getStart();
		double end = this.range.getEnd();
		return ((start <= value) && (value<end));
	}

	public ValueRange getRange() {
		return this.range;
	}

	public ValueRangeRisk() {
		
	}

	public int getID() {
		return this.id;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		this.id=id;
	}

	public EnumScale getRisk() {
		return this.risk;
	}

}