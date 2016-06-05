package com.agnotheist.model;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.agnotheist.model.business.AllBusinessTests;
import com.agnotheist.model.domain.AllDomainTests;
import com.agnotheist.model.services.AllServicesTests;

@RunWith(Suite.class)
@SuiteClasses({AllBusinessTests.class, AllServicesTests.class, AllDomainTests.class})
public class AllTests {

}
