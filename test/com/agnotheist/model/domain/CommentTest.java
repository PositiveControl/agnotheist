package com.agnotheist.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommentTest {

	@Test
	public void testValidate() {
		Comment comment = new Comment (User, Belief, "Comment");
				
		assertTrue("comment validates", comment.validate());
			System.out.println("testValidate PASSED");
	}
	
	@Test
	public void testEqualsComment() {
		Comment comment1 = new Comment (User, Belief, "Comment1");
		Comment comment2 = new Comment (User, Belief, "Comment1");
				
		assertTrue("comment1 equals comment2", comment1.equals(comment2));
			System.out.println("testEqualsComment PASSED");
	}
	
	@Test
	public void testNotEqualsUser() {
		Comment comment1 = new Comment (User, Belief, "Comment1");
		Comment comment2 = new Comment (User, Belief, "Comment2");
				
		assertTrue("comment1 does NOT equal comment2", comment1.equals(comment2));
			System.out.println("testNotEqualsComment PASSED");
	}

}
