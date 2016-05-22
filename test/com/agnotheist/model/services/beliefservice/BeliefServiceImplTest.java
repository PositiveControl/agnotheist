package com.agnotheist.model.services.beliefservice;

import junit.framework.TestCase;
import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.factory.ServiceFactory;

public class BeliefServiceImplTest extends TestCase {

	private ServiceFactory serviceFactory;
	private User user;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		serviceFactory = new ServiceFactory();
		user = new User(
				"Mark", 
				"Evans", 
				"mevans007@regis.edu", 
				"303-333-3333", 
				"pa55w0rd", 
				"123 Main St., Denver, CO 80205"
				);
	}

	public final void testCreateBelief() {
		IBeliefService beliefService = serviceFactory.getBeliefService();
		
		assertTrue(beliefService.createBelief("Catholic", "Stealing is bad", user));
		System.out.println("testCreateBelief PASSED");
	}

}
