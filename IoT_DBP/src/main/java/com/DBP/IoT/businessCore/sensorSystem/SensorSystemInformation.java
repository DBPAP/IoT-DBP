package businessCore.sensorSystem;

import Client;
import Site;

public class SensorSystemInformation {

	private int ID;
	private Client client;
	private Site site;

	public int getID() {
		// TODO - implement SensorSystemInformation.getID
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ID
	 */
	public void setID(int ID) {
		// TODO - implement SensorSystemInformation.setID
		throw new UnsupportedOperationException();
	}

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