package com.agnotheist.model.services.beliefservice;

import junit.framework.TestCase;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.exception.CreateBeliefException;
import com.agnotheist.model.services.factory.ServiceFactory;

public class BeliefServiceImplTest extends TestCase {

	private ServiceFactory serviceFactory;
	private User user;
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		
		serviceFactory = ServiceFactory.getInstance();
		
		user = new User(
				"Mark", 
				"Evans", 
				"mevans007@regis.edu", 
				"303-333-3333", 
				"pa55w0rd", 
				"123 Main St., Denver, CO 80205"
				);
	}

	public final void testCreateBelief() throws CreateBeliefException, ServiceLoadException {
		IBeliefService beliefService;
		try {
			
			beliefService = (IBeliefService) serviceFactory.getService(IBeliefService.NAME);
		
			assertTrue(beliefService.createBelief("Catholic", "Stealing is bad", user));
			System.out.println("testCreateBelief PASSED");
		
		} catch (CreateBeliefException cbe){
			cbe.printStackTrace();
			fail("CreateBeliefException");
		}
	}
	
	public final void testCreateBeliefWithNullBelief() throws CreateBeliefException, ServiceLoadException {
		IBeliefService beliefService;
		try {
			
			beliefService = (IBeliefService) serviceFactory.getService(IBeliefService.NAME);
		
			assertFalse(beliefService.createBelief(null, "Stealing is bad", user));
			System.out.println("testCreateBeliefWithNullBelief PASSED");
		
		} catch (CreateBeliefException cbe){
			cbe.printStackTrace();
			fail("CreateBeliefException");
		}
	}
	
	public final void testCreateBeliefWithNullBeliefStatement() throws CreateBeliefException, ServiceLoadException {	
		IBeliefService beliefService;
		try {
			
			beliefService = (IBeliefService) serviceFactory.getService(IBeliefService.NAME);
		
			assertFalse(beliefService.createBelief("Catholic", null, user));
			System.out.println("testCreateBeliefWithNullBeliefStatement PASSED");
		
		} catch (CreateBeliefException cbe){
			cbe.printStackTrace();
			fail("CreateBeliefException");
		}	
	}
	
	public final void testCreateBeliefWithNullUser() throws CreateBeliefException, ServiceLoadException {
		IBeliefService beliefService;
		try {
			
			beliefService = (IBeliefService) serviceFactory.getService(IBeliefService.NAME);
		
			assertFalse(beliefService.createBelief("Catholic", "Stealing is bad", null));
			System.out.println("testCreateBeliefWithNullUser PASSED");
		
		} catch (CreateBeliefException cbe){
			cbe.printStackTrace();
			fail("CreateBeliefException");
		}
	}

}
