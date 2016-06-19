package com.agnotheist.model.business.manager;

import com.agnotheist.model.services.commentservice.ICommentService;
import com.agnotheist.model.services.exception.PostCommentException;
import com.agnotheist.model.services.factory.ServiceFactory;

import com.agnotheist.model.business.exception.ServiceLoadException;
import com.agnotheist.model.domain.Belief;
import com.agnotheist.model.domain.User;

public class CommentMgr extends ManagerSuperType {
	
	private static CommentMgr _instance;
	
	public CommentMgr() {
		
	}
	
	public static synchronized CommentMgr getInstance() {
		if (_instance == null) {
			_instance = new CommentMgr();
		}
		return _instance;
	}
	
	@Override
	/**
	 * 
	 */
	public boolean performAction(String commandString, User user, Belief belief, String comment) {
		boolean action = false;
		
		if (commandString.equals("PostComment")) {
			action = create(ICommentService.NAME, user, belief, comment);
		}
		return action;
	}

	
	public boolean create(String command, User user, Belief belief, String comment) {
		boolean created = false;
		if (user != null && belief != null && comment != null) {
			ServiceFactory svcFactory = ServiceFactory.getInstance();
			ICommentService iCommentService;
			
			try {
				iCommentService = (ICommentService) svcFactory.getService(command);
				created = iCommentService.postComment(user, belief, comment);
			} catch (ServiceLoadException sle) {
				System.out.println("CommentMgr::post failed");
			} catch(PostCommentException pce) {
				System.out.println("CommentMgr::post failed");
			}
		}
		return created;
	}

	@Override
	public boolean performAction(String commandString, String belief, String beliefStatement, User user) {
		// TODO Auto-generated method stub
		return false;
	}
}
