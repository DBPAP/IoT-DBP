package com.DBP.IoT.businessCore.measure;

import java.util.Observable;

public interface Observer {

	/**
	 * 
	 * @param subject
	 * @param argument
	 */
	void update(Observable subject, Object argument);

}