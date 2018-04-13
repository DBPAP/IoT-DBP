package com.DBP.IoT.businessCore.sensorSystem;

import java.util.EnumSet;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="valueRangeRisk")
public class ValueRangeRisk {

	@Id
	@GeneratedValue
	private int internalId;
	@Column(name = "risk")
	@Enumerated(EnumType.STRING)
	private IoTIncHazardScale risk;
	@Column(name="groupId")
	private String groupId;
	@OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
	private ValueRange range;

	
	public ValueRangeRisk() {
		
	}

	/**
	 * 
	 * @param start
	 * @param end
	 * @param risk
	 */
	public ValueRangeRisk(double start, double end, IoTIncHazardScale risk,String groupId) {
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
	public void setRisk(IoTIncHazardScale risk) {
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
	
	
	

	

	public IoTIncHazardScale getRisk() {
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