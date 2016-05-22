package com.agnotheist.model.services.beliefservice;

import com.agnotheist.model.domain.User;

public interface IBeliefService {
	public boolean createBelief(String belief, String beliefStatement, User user);	
}
