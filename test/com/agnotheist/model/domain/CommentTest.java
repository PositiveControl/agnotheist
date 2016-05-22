package com.agnotheist.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommentTest {

	@Test
	public void testValidate() {
		User user = new User ("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		Belief belief = new Belief ("Buddhist", "Killing is bad", user);
		Comment comment = new Comment (user, belief, "Comment");
				
		assertTrue("comment validates", comment.validate());
			System.out.println("testValidate PASSED");
	}
	
	@Test
	public void testEqualsComment() {
		User user = new User ("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		Belief belief = new Belief ("Buddhist", "Killing is bad", user);
		Comment comment1 = new Comment (user, belief, "Comment1");
		Comment comment2 = comment1;
				
		assertTrue("comment1 equals comment2", comment1.equals(comment2));
			System.out.println("testEqualsComment PASSED");
	}
	
	@Test
	public void testNotEqualsComment() {
		User user = new User ("Joe", "Doe", "test@example.com", "123", "abc", "123 Main St.");
		Belief belief = new Belief ("Buddhist", "Killing is bad", user);
		Comment comment1 = new Comment (user, belief, "Comment1");
		Comment comment2 = new Comment (user, belief, "Comment2");
				
		assertFalse("comment1 does NOT equal comment2", comment1.equals(comment2));
			System.out.println("testNotEqualsComment PASSED");
	}

}
