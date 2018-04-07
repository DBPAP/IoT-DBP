package com.DBP.IoT.businessCore.sensorSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class ValueRangeRisk {

	private int internalId;
	private EnumScale risk;
	private String groupId;
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
	 * @param start
	 * @param end
	 * @param risk
	 */
	public ValueRangeRisk(double start, double end, EnumScale risk,String groupId) {
		this.range=new ValueRange(start,end);
		this.risk=risk;
		this.groupId=groupId;
		
	}

	/**
	 * 
	 * @param value
	 */
	public boolean isIn(double value) {
		return true;
	}

	public ValueRange getRange() {
		return range;
	}

	public ValueRangeRisk() {
		
	}

	public int getInternalID() {
		return this.internalId;
	}

	/**
	 * 
	 * @param internalID
	 */
	public void setId(int internalID) {
		this.internalId=internalID;
	}

	public EnumScale getRisk() {
		return this.risk;
	}

	/**
	 * @return the groupID
	 */
	public String getGroupId() {
		return groupId;
	}

	/**
	 * @param groupID the groupID to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}