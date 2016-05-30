package com.agnotheist.model.services.beliefservice;

import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.exception.CreateBeliefException;

public class BeliefServiceImpl implements IBeliefService {
	public boolean createBelief(String belief, String beliefStatement, User user) 
		throws CreateBeliefException {
			boolean isValid = false;
			
			try {
				if (user != null) {
					if (belief != null) {
						if (beliefStatement != null) {
							System.out.println("Entering method BeliefServiceImpl::createBelief");
							isValid = true; 
						} else {
							isValid = false;
							throw new CreateBeliefException("Null beliefStatement passed to BeliefServiceImpl::createBelief");
						}
					} else {
						isValid = false;
						throw new CreateBeliefException("Null belief passed to BeliefServiceImpl::createBelief");
					}
				} else {
					isValid = false;
					throw new CreateBeliefException("Null user passed to BeliefServiceImpl::createBelief");
				}
			} catch(CreateBeliefException cbe) {
				isValid = false;
				throw new CreateBeliefException("Beleif could not be created", cbe);
			} finally {
				return isValid;
			}
	};
}
