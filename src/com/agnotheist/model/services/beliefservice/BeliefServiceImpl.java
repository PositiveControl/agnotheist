package com.agnotheist.model.services.beliefservice;

import com.agnotheist.model.domain.User;

public class BeliefServiceImpl implements IBeliefService {
	public boolean createBelief(String belief, String beliefStatement, User user) {
		System.out.println("Entering method BeliefServiceImpl::createBelief");
		return true;
	};
}
