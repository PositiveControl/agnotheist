package com.agnotheist.model.services.beliefservice;

import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.exception.CreateBeliefException;

public interface IBeliefService {
	public boolean createBelief(String belief, String beliefStatement, User user) 
			throws CreateBeliefException;	
}
