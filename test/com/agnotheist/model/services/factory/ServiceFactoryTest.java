package com.agnotheist.model.services.factory;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import com.agnotheist.model.services.factory.ServiceFactory;
import com.agnotheist.model.services.beliefservice.IBeliefService;
import com.agnotheist.model.services.beliefservice.BeliefServiceImpl;

public class ServiceFactoryTest {
	
	ServiceFactory serviceFactory;
	
	@Before
	public void setUp() throws Exception {
		serviceFactory = new ServiceFactory();
		
	}
	
	@Test
	public void testGetBeliefService() {
		IBeliefService beliefService = (IBeliefService)serviceFactory.getBeliefService();
		assertTrue(beliefService instanceof BeliefServiceImpl);
	}

}
