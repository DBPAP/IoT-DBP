package com.DBP.IoT.businessCore.sensorSystem;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * Rappresenta un intervallo di valori reali su R.
 * L'intervallo non può essere chiuso per assicurare la continuità su R di intervalli adiacenti.
 * Se "start = -∞" , allora "end" dovrà essere un numero reale oppure +∞;
 * Se "end = +∞", allora start dovrà essere un numero reale oppure -∞;
 * Se start ed end sono due numeri reali allora l'intervallo è chiuso a sinistra ed aperto a destra :
 *  "[start, end["
 * @author DiBenedetto & Paolicelli
 *
 */
public class ValueRange {

<<<<<<< HEAD
	private int internalId;
=======
	private int id;
>>>>>>> refs/remotes/origin/master
	private double start;
	private double end;

	public ValueRange() {
		
	}

<<<<<<< HEAD
	/**
	 * 
	 * @param start
	 * @param end
	 */
	public ValueRange(double start, double end) {
		this.start = start;
		this.end = end;
	}
=======
>>>>>>> refs/remotes/origin/master

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
=======
	public int getID() {
		return this.id;
>>>>>>> refs/remotes/origin/master
	}

	/**
	 * @param internalId the internalId to set
	 */
<<<<<<< HEAD
	public void setInternalId(int internalId) {
		this.internalId = internalId;
=======
	public void setID(int id) {
		this.id=id;
>>>>>>> refs/remotes/origin/master
	}

	
}