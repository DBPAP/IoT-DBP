package com.DBP.IoT.businessCore.measure;

import java.time.LocalDate;
import java.util.Observable;



public class SummaryHandler implements Observer {

	private static SummaryHandler instance;

	public void doCalculation() {
		// TODO - implement SummaryHandler.doCalculation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param SensorGroupId
	 * @param startDate
	 * @param endDate
	 */
	public void computeInPeriod(int SensorGroupId, LocalDate startDate, LocalDate endDate) {
		

		
	}

	private SummaryHandler() {
		
		throw new UnsupportedOperationException();
	}


	/**
	 * 
	 * @param subject
	 * @param argument
	 */
	
	@Override
	public void update(Observable subject, Object argument) {
		throw new UnsupportedOperationException();
		
	}

	/**
	 * @return the istance
	 */
	public static SummaryHandler getIstance() {
		if (SummaryHandler.instance==null) {
			instance = new SummaryHandler();
			}
			return SummaryHandler.instance;
	}

	/**
	 * @param istance the istance to set
	 */


}