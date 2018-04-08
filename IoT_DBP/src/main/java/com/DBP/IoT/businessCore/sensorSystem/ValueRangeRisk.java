package com.DBP.IoT.businessCore.sensorSystem;

<<<<<<< HEAD
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
=======
>>>>>>> refs/remotes/origin/master

public class ValueRangeRisk {

<<<<<<< HEAD
	private int internalId;
=======
	private int id;
>>>>>>> refs/remotes/origin/master
	private EnumScale risk;
<<<<<<< HEAD
	private String groupId;
=======
	private int GroupID;
>>>>>>> refs/remotes/origin/master
	private ValueRange range;

	/**
	 * 
	 * @param range
	 */
<<<<<<< HEAD
	public void setRange(double start, double end) {
		this.range=new ValueRange(start,end);
=======
	public void setRange(ValueRange range) {
		this.range=range;
>>>>>>> refs/remotes/origin/master
	}

	/**
	 * 
	 * @param risk
	 */
	public void setRisk(EnumScale risk) {
		this.risk = risk;
	}

<<<<<<< HEAD
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

=======
	
>>>>>>> refs/remotes/origin/master
	/**
	 * 
	 * @param value
	 */
	public boolean isIn(double value) {
<<<<<<< HEAD
		return true;
=======
		double start = this.range.getStart();
		double end = this.range.getEnd();
		return ((start <= value) && (value<end));
>>>>>>> refs/remotes/origin/master
	}

	public ValueRange getRange() {
<<<<<<< HEAD
		return range;
=======
		return this.range;
>>>>>>> refs/remotes/origin/master
	}

	public ValueRangeRisk() {
		
	}

<<<<<<< HEAD
	public int getInternalID() {
		return this.internalId;
=======
	public int getID() {
		return this.id;
>>>>>>> refs/remotes/origin/master
	}

	/**
	 * 
	 * @param internalID
	 */
<<<<<<< HEAD
	public void setId(int internalID) {
		this.internalId=internalID;
=======
	public void setID(int ID) {
		this.id=id;
>>>>>>> refs/remotes/origin/master
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