package com.agnotheist.model.business.manager;

import junit.framework.TestCase;
import org.junit.Test;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.exception.CreateBeliefException;

public class BeliefMgrTest extends TestCase {

	@Test
	public void testCreate() throws ServiceLoadException, CreateBeliefException {
		User user = new User("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		BeliefMgr beliefMgr = new BeliefMgr();
		
		assertTrue(beliefMgr.create("Lutheran", "Pray Daily", user));
	}
	
	public void testCreateFailNoArguments() throws ServiceLoadException, CreateBeliefException {
		BeliefMgr beliefMgr = new BeliefMgr();
		
		assertFalse(beliefMgr.create(null, null, null));
	}
	
	public void testCreateFailNoBelief() throws ServiceLoadException, CreateBeliefException {
		User user = new User("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		BeliefMgr beliefMgr = new BeliefMgr();
		
		assertFalse(beliefMgr.create(null, "Pray Daily", user));
	}
	
	public void testCreateFailNoBeliefStatement() 
			throws ServiceLoadException, CreateBeliefException {
		User user = new User("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		BeliefMgr beliefMgr = new BeliefMgr();
		
		assertFalse(beliefMgr.create("Lutheran", null, user));
	}
	
	public void testCreateFailNoUser() throws ServiceLoadException, CreateBeliefException {		
		BeliefMgr beliefMgr = new BeliefMgr();
		
		assertFalse(beliefMgr.create("Lutheran", "Pray Daily", null));
	}
}
