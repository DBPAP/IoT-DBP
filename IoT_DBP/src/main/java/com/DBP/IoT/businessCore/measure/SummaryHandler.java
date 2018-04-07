package businessCore.measure;

import LocalDate;
import Observable;
import Object;

public class SummaryHandler implements Observer {

	private static SummaryHandler istance;

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
		// TODO - implement SummaryHandler.computeInPeriod
		throw new UnsupportedOperationException();
	}

	private SummaryHandler() {
		// TODO - implement SummaryHandler.SummaryHandler
		throw new UnsupportedOperationException();
	}

	public static SummaryHandler getIstance() {
		return this.istance;
	}

	/**
	 * 
	 * @param subject
	 * @param argument
	 */
	public void update(Observable subject, Object argument) {
		// TODO - implement SummaryHandler.update
		throw new UnsupportedOperationException();
	}

}