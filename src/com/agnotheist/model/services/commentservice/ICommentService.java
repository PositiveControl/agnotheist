/**
 * 
 */
package com.agnotheist.model.services.commentservice;

import com.agnotheist.model.domain.Belief;
import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.IService;
import com.agnotheist.model.services.exception.PostCommentException;

/**
 * @author mevans
 *
 */
public interface ICommentService extends IService {
	public final String NAME = "ICommentService";
	
	/**
	 * 
	 * @param user
	 * @param belief
	 * @param comment
	 * @return boolean
	 * @throws PostCommentException
	 */
	public boolean postComment(User user, Belief belief, String comment)
		throws PostCommentException;
}
