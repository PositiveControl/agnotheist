package com.agnotheist.model.services;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.agnotheist.model.services.beliefservice.BeliefServiceImplTest;
import com.agnotheist.model.services.factory.ServiceFactoryTest;

@RunWith(Suite.class)
@SuiteClasses({ServiceFactoryTest.class, BeliefServiceImplTest.class})
public class AllServicesTests {

}
