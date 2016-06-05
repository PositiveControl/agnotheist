package com.agnotheist.model.business.factory;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.services.beliefservice.BeliefServiceImpl;
import com.agnotheist.model.services.beliefservice.IBeliefService;
import com.agnotheist.model.services.factory.ServiceFactory;

public class ServiceFactoryTest extends TestCase {
	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception {
		serviceFactory = ServiceFactory.getInstance();
	}
	
	@Test
	public void testGetInstance() {
		assertNotNull(serviceFactory);
	}
	
	public void testGetBeliefService() {
		IBeliefService beliefService;
		try {
			beliefService = (IBeliefService)serviceFactory.getService(IBeliefService.NAME);
			assertTrue(beliefService instanceof BeliefServiceImpl);
			System.out.println("testGetBeliefService PASSED");
		} catch (ServiceLoadException e) {
			e.printStackTrace();
			fail("ServiceLoadException");
		}
	}
}
