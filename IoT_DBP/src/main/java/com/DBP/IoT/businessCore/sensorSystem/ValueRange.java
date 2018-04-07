package com.DBP.IoT.businessCore.sensorSystem;

/**
 * Rappresenta un intervallo di valori reali su R.
 * L'intervallo non può essere chiuso per assicurare la continuità su R di intervalli adiacenti.
 * Se "start = -∞" , allora "end" dovrà essere un numero reale oppure +∞;
 * Se "end = +∞", allora start dovrà essere un numero reale oppure -∞;
 * Se start ed end sono due numeri reali allora l'intervallo è chiuso a sinistra ed aperto a destra :
 *  "[start, end["
 * @author Tito
 *
 */
public class ValueRange {

	private int id;
	private double start;
	private double end;

	public ValueRange() {
		
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

	public int getID() {
		return this.id;
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int id) {
		this.id=id;
	}

}