package com.DBP.IoT.businessCore.monitoring;

import java.util.Observable;
/**
 * Classe astratta che gestisce i messaggi
 * @author Alessandro
 *
 */

public abstract class MessageManager extends Observable {

	/**
	 * 
	 * @param misura
	 */
	public void newMeasure(String misura) {
		// TODO - implement MessageManager.newMeasure
		throw new UnsupportedOperationException();
	}

}