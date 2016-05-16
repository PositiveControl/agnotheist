package com.agnotheist.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeliefTest {

	@Test
	public void testValidate() {
		Belief belief = new Belief ("Catholic", "Killing is bad.", User, Comment);
				
		assertTrue("belief validates", belief.validate());
			System.out.println("testValidate PASSED");
	}
	
	@Test
	public void testEqualsBelief() {
		Belief belief1 = new Belief ("Catholic", "Killing is bad.", User, Comment);
		Belief belief2 = new Belief ("Catholic", "Killing is bad.", User, Comment);
				
		assertTrue("belief1 equals belief2", belief1.equals(belief2));
			System.out.println("testEqualsComment PASSED");
	}
	
	@Test
	public void testNotEqualsUser() {
		Belief belief1 = new Belief ("Catholic", "Killing is bad.", User, Comment);
		Belief belief2 = new Belief ("Catholic", "Killing is kind of bad.", User, Comment);
				
		assertTrue("belief1 does NOT equal belief2", belief1.equals(belief2));
			System.out.println("testNotEqualsBelief PASSED");
	}

}
