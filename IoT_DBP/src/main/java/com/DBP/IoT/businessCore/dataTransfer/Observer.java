package businessCore.dataTransfer;

import Observable;
import Object;

public interface Observer {

	/**
	 * 
	 * @param subject
	 * @param argument
	 */
	void update(Observable subject, Object argument);

}