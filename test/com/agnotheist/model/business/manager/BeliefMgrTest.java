package com.agnotheist.model.business.manager;

import junit.framework.TestCase;
import org.junit.Test;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.exception.CreateBeliefException;

public class BeliefMgrTest extends TestCase {
	
	private BeliefMgr beliefMgr;
	private User user;
	
	protected void setUp() throws Exception {
		super.setUp();
		beliefMgr = BeliefMgr.getInstance();
		user = new User("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
	}

	@Test
	public void testCreate() throws ServiceLoadException, CreateBeliefException {
		boolean action = beliefMgr.performAction("CreateBelief", "Lutheran", "Pray Daily", user);
		assertTrue(action);
	}
	
	public void testCreateFailNoArguments() throws ServiceLoadException, CreateBeliefException {
		boolean action = beliefMgr.performAction("CreateBelief", null, null, null);
		assertFalse(action);
	}
	
	public void testCreateFailNoBelief() throws ServiceLoadException, CreateBeliefException {
		boolean action = beliefMgr.performAction("CreateBelief", null, "Pray Daily", user);
		assertFalse(action);
	}
	
	public void testCreateFailNoBeliefStatement() 
			throws ServiceLoadException, CreateBeliefException {
		boolean action = beliefMgr.performAction("CreateBelief", "Lutheran", null, user);
		assertFalse(action);
	}
	
	public void testCreateFailNoUser() throws ServiceLoadException, CreateBeliefException {		
		boolean action = beliefMgr.performAction("CreateBelief", "Lutheran", "Pray Daily", null);
		assertFalse(action);
	}
}
