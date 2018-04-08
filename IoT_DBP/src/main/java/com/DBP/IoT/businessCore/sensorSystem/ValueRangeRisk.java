package com.DBP.IoT.businessCore.sensorSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


public class ValueRangeRisk {


	private int internalId;

	private EnumScale risk;

	private String groupId;

	private ValueRange range;

	
	public ValueRangeRisk() {
		
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
	 * @param range
	 */

	public void setRange(double start, double end) {
		this.range=new ValueRange(start,end);

	}

	/**
	 * 
	 * @param risk
	 */
	public void setRisk(EnumScale risk) {
		this.risk = risk;
	}
	/**
	 * @return true se un valore è all'interno di un intervallo valori
	 * @param value
	 */
	public boolean isIn(double value) {
		double start = this.range.getStart();
		double end = this.range.getEnd();
		return ((start < value) && (end>value));

	}

	public ValueRange getRange() {

		return this.range;

	}

	


	public int getInternalID() {
		return this.internalId;
	}
	
	
	

	

	public EnumScale getRisk() {
		return this.risk;
	}

	/**
	 * @return the groupID
	 */
	public String getGroupId() {
		return this.groupId;
	}

	/**
	 * @param groupID the groupID to set
	 */
	public void setGroupId(String groupId) {
		this.groupId = groupId;
	}

}