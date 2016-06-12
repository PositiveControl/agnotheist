package com.agnotheist.model.business.manager;

import com.agnotheist.model.services.beliefservice.IBeliefService;
import com.agnotheist.model.services.exception.CreateBeliefException;
import com.agnotheist.model.services.factory.ServiceFactory;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.domain.User;

public class BeliefMgr extends ManagerSuperType {
	
	private static BeliefMgr _instance;
	
	public BeliefMgr() {
		
	}
	
	public static synchronized BeliefMgr getInstance() {
		if (_instance == null) {
			_instance = new BeliefMgr();
		}
		return _instance;
	}
	
	@Override
	/**
	 * 
	 */
	public boolean performAction(String commandString, String belief, String beliefStatement, User user) {
		boolean action = false;
		
		if (commandString.equals("CreateBelief")) {
			action = create(IBeliefService.NAME, belief, beliefStatement, user);
		}
		return action;
	}

	/**
	 * 
	 * @param command
	 * @param belief
	 * @param beliefStatement
	 * @param user
	 * @return boolean
	 */
	public boolean create(String command, String belief, String beliefStatement, User user) {
		boolean created = false;
		if (belief != null && beliefStatement != null && user != null) {
			ServiceFactory svcFactory = ServiceFactory.getInstance();
			IBeliefService iBeliefService;
			
			try {
				iBeliefService = (IBeliefService) svcFactory.getService(command);
				created = iBeliefService.createBelief(belief, beliefStatement, user);
				return created;
			} catch (ServiceLoadException sle) {
				System.out.println("BeliefMgr::create failed");
				return created;
			} catch(CreateBeliefException cbe) {
				System.out.println("BeliefMgr::create failed");
				return created;
			}
		} else {
			return created;
		}
	}
}
