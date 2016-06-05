package com.agnotheist.model.business;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.agnotheist.model.business.factory.ServiceFactoryTest;
import com.agnotheist.model.business.manager.BeliefMgrTest;

@RunWith(Suite.class)
@SuiteClasses({ServiceFactoryTest.class, BeliefMgrTest.class})
public class AllBusinessTests {

}
