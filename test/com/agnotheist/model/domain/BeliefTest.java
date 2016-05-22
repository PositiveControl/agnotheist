package com.agnotheist.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class BeliefTest {

	@Test
	public void testValidate() {
		User user = new User ("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		Belief belief = new Belief ("Catholic", "Killing is bad.", user);
				
		assertTrue("belief validates", belief.validate());
			System.out.println("testValidate PASSED");
	}
	
	@Test
	public void testEqualsBelief() {
		User user = new User ("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		Belief belief1 = new Belief ("Catholic", "Killing is bad.", user);
		Belief belief2 = new Belief ("Catholic", "Killing is bad.", user);
				
		assertTrue("belief1 equals belief2", belief1.equals(belief2));
			System.out.println("testEqualsComment PASSED");
	}
	
	@Test
	public void testNotEqualsUser() {
		User user = new User ("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		Belief belief1 = new Belief ("Catholic", "Killing is bad.", user);
		Belief belief2 = new Belief ("Catholic", "Killing is kind of bad.", user);
				
		assertFalse("belief1 does NOT equal belief2", belief1.equals(belief2));
			System.out.println("testNotEqualsBelief PASSED");
	}

}
