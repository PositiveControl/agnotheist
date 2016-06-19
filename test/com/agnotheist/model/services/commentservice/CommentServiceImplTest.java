package com.agnotheist.model.services.commentservice;

import junit.framework.TestCase;

import org.junit.Test;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.domain.Comment;
import com.agnotheist.model.domain.User;
import com.agnotheist.model.domain.Belief;
import com.agnotheist.model.services.exception.PostCommentException;
import com.agnotheist.model.services.factory.ServiceFactory;

public class CommentServiceImplTest extends TestCase {
		private ServiceFactory serviceFactory;
		private User user;
		private Belief belief;
		private Comment comment;
		
		@Override
		protected void setUp() throws Exception {
			super.setUp();
			
			serviceFactory = ServiceFactory.getInstance();
			
			user = new User(
					"Mark", 
					"Evans", 
					"mevans007@regis.edu", 
					"303-333-3333", 
					"pa55w0rd", 
					"123 Main St., Denver, CO 80205"
					);
			belief = new Belief("Islam", "72 virgins", user);
		}
		
		public final void testPostComment() throws PostCommentException, ServiceLoadException {
			ICommentService commentService;
			try {
				
				commentService = (ICommentService) serviceFactory.getService(ICommentService.NAME);
			
				assertTrue(commentService.postComment(user, belief, "Yay"));
				System.out.println("testPostComment PASSED");
			
			} catch (PostCommentException pce){
				pce.printStackTrace();
				fail("PostCommentException");
			}
		}
		
		public final void testPostCommentWithNullBelief() throws PostCommentException, ServiceLoadException {
			ICommentService commentService;
			try {
				
				commentService = (ICommentService) serviceFactory.getService(ICommentService.NAME);
				
				assertFalse(commentService.postComment(user, null, "I totally agree."));
				System.out.println("testPostCommentExceptionWithNullBelief PASSED");
			
			} catch (PostCommentException cbe){
				cbe.printStackTrace();
				fail("PostCommentException");
			}
		}
		
		public final void testPostCommentWithNullUser() throws PostCommentException, ServiceLoadException {	
			ICommentService commentService;
			try {
				
				commentService = (ICommentService) serviceFactory.getService(ICommentService.NAME);
			
				assertFalse(commentService.postComment(null, belief, "No way!?!"));
				System.out.println("testPostCommentWithNullUser PASSED");
			
			} catch (PostCommentException pce){
				pce.printStackTrace();
				fail("PostCommentException");
			}	
		}
		
		public final void testPostCommentWithNullComment() throws PostCommentException, ServiceLoadException {
			ICommentService commentService;
			try {
				
				commentService = (ICommentService) serviceFactory.getService(ICommentService.NAME);
			
				assertFalse(commentService.postComment(user, belief, null));
				System.out.println("testPostCommentWithNullComment PASSED");
			
			} catch (PostCommentException pce){
				pce.printStackTrace();
				fail("PostCommentException");
			}
		}
}
