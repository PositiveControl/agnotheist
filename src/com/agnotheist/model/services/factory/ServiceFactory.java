package com.agnotheist.model.services.factory;

import com.agnotheist.model.services.beliefservice.IBeliefService;
import com.agnotheist.model.services.beliefservice.BeliefServiceImpl;

public class ServiceFactory {
 public IBeliefService getBeliefService() {
	 return new BeliefServiceImpl();
 }
}
