package com.agnotheist.model.business;

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
		beliefMgr.create("Lutheran", "Pray Daily", user);
		
		assertTrue(beliefMgr.create("Lutheran", "Pray Daily", user));
	}

}
