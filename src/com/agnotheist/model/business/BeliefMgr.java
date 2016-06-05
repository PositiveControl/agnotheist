package com.agnotheist.model.business;

import com.agnotheist.model.services.beliefservice.IBeliefService;
import com.agnotheist.model.services.exception.CreateBeliefException;
import com.agnotheist.model.services.factory.ServiceFactory;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.domain.User;

public class BeliefMgr {
	public boolean create(String belief, String beliefStatement, User user) throws 
		ServiceLoadException, CreateBeliefException {
			ServiceFactory svcFactory = ServiceFactory.getInstance();
			
			IBeliefService beliefService = (IBeliefService)svcFactory.getService(IBeliefService.NAME);
			
			try {
				beliefService.createBelief(belief, beliefStatement, user);
				return true;
			} catch(CreateBeliefException cbe) {
				System.out.println(cbe);
				return false;
			}
	}
}
