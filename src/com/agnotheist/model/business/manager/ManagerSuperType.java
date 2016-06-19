package com.agnotheist.model.business.manager;

import com.agnotheist.model.business.exception.PropertyFileNotFoundException;
import com.agnotheist.model.domain.Belief;
import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.manager.PropertyManager;

public abstract class ManagerSuperType {

	/**
	 * 
	 */
	static {
		try { ManagerSuperType.loadProperties();
		} catch (PropertyFileNotFoundException propertyFileNotFoundException) {
			System.out.println("Application Properties failed to load - Exiting...");
			System.exit(1);
		}
	}
	
	public abstract boolean performAction(String commandString, String belief, String beliefStatement, User user);
	public abstract boolean performAction(String commandString, User user, Belief belief, String comment);
	/**
	 * 
	 * @throws PropertyFileNotFoundException
	 */
	public static void loadProperties () throws PropertyFileNotFoundException {
		String propertyFileLocation = System.getProperty("prop_location");
		if (propertyFileLocation != null) {
			PropertyManager.loadProperties(propertyFileLocation);
		}
	}
}
