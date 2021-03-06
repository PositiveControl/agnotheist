package com.agnotheist.model.services.factory;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.agnotheist.model.services.factory.ServiceFactory;
import com.agnotheist.model.services.beliefservice.IBeliefService;
import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.services.beliefservice.BeliefServiceImpl;

public class ServiceFactoryTest {
	
	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception {
		serviceFactory = ServiceFactory.getInstance();
		
	}
	
	@Test
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
