package com.agnotheist.model.services.beliefservice;

import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.IService;
import com.agnotheist.model.services.exception.CreateBeliefException;

public interface IBeliefService extends IService {
	public final String NAME = "IBeliefService";
	
	/**
	 * 
	 * @param belief
	 * @param beliefStatement
	 * @param user
	 * @return boolean
	 * @throws CreateBeliefException
	 */
	public boolean createBelief(String belief, String beliefStatement, User user) 
			throws CreateBeliefException;	
}
