package com.DBP.IoT.businessCore.sensorSystem;



public class SensorSystemInformation {

	private int id;
	private Client client;
	private Site site;

	

	public Client getClient() {
		return this.client;
	}

	/**
	 * 
	 * @param client
	 */
	public void setClient(Client client) {
		this.client = client;
	}

	public Site getSite() {
		return this.site;
	}

	/**
	 * 
	 * @param site
	 */
	public void setSite(Site site) {
		this.site = site;
	}

}