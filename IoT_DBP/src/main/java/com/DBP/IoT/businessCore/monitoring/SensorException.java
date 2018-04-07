package businessCore.monitoring;

import LocalDate;
import LocalTime;

public abstract class SensorException extends Exception {

	private int ID;
	private LocalDate date;
	private LocalTime time;

}