package com.DBP.IoT.businessCore.toPresentationInterface;

import java.util.Observer;

public class Observable {

	private Observer[] observers;

	/**
	 * 
	 * @param o
	 */
	public void attach(Observer o) {
		// TODO - implement Observable.attach
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param o
	 */
	public void detach(Observer o) {
		// TODO - implement Observable.detach
		throw new UnsupportedOperationException();
	}

	

	/**
	 * @return the observers
	 */
	public Observer[] getObservers() {
		return observers;
	}

	/**
	 * @param observers the observers to set
	 */
	public void setObservers(Observer[] observers) {
		this.observers = observers;
	}

}