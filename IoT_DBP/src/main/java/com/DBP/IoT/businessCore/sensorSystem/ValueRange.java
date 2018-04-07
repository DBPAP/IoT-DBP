package com.DBP.IoT.businessCore.sensorSystem;

/**
 * Rappresenta un intervallo di valori reali su R.
 * L'intervallo non può essere chiuso per assicurare la continuità su R con intervalli adiacenti.
 * Se "start = -∞" , allora "end" dovrà essere un numero reale oppure +∞;
 * Se "end = +∞", allora start dovrà essere un numero reale oppure -∞;
 * Se start ed end sono due numeri reali allora l'intervallo è chiuso a sinistra ed aperto a destra :
 *  "[start, end["
 * @author DiBenedetto & Paolicelli
 *
 */
public class ValueRange {

	private int internalId;
	private double start;
	private double end;

	public ValueRange() {
		
	}

	/**
	 * 
	 * @param start
	 * @param end
	 */
	public ValueRange(double start, double end) {
		this.start = start;
		this.end = end;
	}

	/**
	 * 
	 * @param start
	 */
	public void setStart(double start) {
		this.start = start;
	}

	/**
	 * 
	 * @param end
	 */
	public void setEnd(double end) {
		this.end = end;
	}

	public double getStart() {
		return this.start;
	}

	public double getEnd() {
		return this.end;
	}

	/**
	 * @return the internalId
	 */
	public int getInternalId() {
		return internalId;
	}

	/**
	 * @param internalId the internalId to set
	 */
	public void setInternalId(int internalId) {
		this.internalId = internalId;
	}

	
}