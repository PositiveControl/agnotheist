package com.agnotheist.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserTest {

	@Test
	public void testValidate() {
		User user = new User (
				"Mark", 
				"Evans", 
				"mevans007@regis.edu", 
				"303-333-3333", 
				"pa55w0rd", 
				"123 Main St., Denver, CO 80205"
				);
				
		assertTrue("user validates", user.validate());
			System.out.println("testValidate PASSED");
	}
	
	@Test
	public void testEqualsUser() {
		User user1 = new User (
				"Mark", 
				"Evans", 
				"mevans007@regis.edu", 
				"303-333-3333", 
				"pa55w0rd", 
				"123 Main St., Denver, CO 80205"
				);
		
		User user2 = new User (
				"Mark", 
				"Evans", 
				"mevans007@regis.edu", 
				"303-333-3333", 
				"pa55w0rd", 
				"123 Main St., Denver, CO 80205"
				);
				
		assertTrue("user1 equals user2", user1.equals(user2));
			System.out.println("testEqualsUser PASSED");
	}
	
	@Test
	public void testNotEqualsUser() {
		User user1 = new User (
				"John", 
				"Evans", 
				"mevans007@regis.edu", 
				"303-333-3333", 
				"pa55w0rd", 
				"123 Main St., Denver, CO 80205"
				);
		
		User user2 = new User (
				"Mark", 
				"Evans", 
				"mevans007@regis.edu", 
				"303-333-3333", 
				"pa55w0rd", 
				"123 Main St., Denver, CO 80205"
				);
				
		assertFalse("user1 does NOT equal user2", user1.equals(user2));
			System.out.println("testNotEqualsUser PASSED");
	}

}