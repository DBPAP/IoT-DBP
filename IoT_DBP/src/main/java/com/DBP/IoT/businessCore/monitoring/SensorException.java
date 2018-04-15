package com.DBP.IoT.businessCore.monitoring;
/**
 * Classe che gestisce le eccezioni
 */

import java.time.LocalDate;
import java.time.LocalTime;



/**
 * classe che gestisce le eccezioni dei sensori
 * @author Alessandro
 *
 */
public abstract class SensorException implements Exception {

	private int ID;
	private LocalDate date;
	private LocalTime time;
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}
	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}
	/**
	 * @return the date
	 */
	public LocalDate getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(LocalDate date) {
		this.date = date;
	}
	/**
	 * @return the time
	 */
	public LocalTime getTime() {
		return time;
	}
	/**
	 * @param time the time to set
	 */
	public void setTime(LocalTime time) {
		this.time = time;
	}

}