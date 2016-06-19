/**
 * 
 */
package com.agnotheist.model.services.commentservice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.agnotheist.model.domain.Belief;
import com.agnotheist.model.domain.Comment;
import com.agnotheist.model.domain.User;
import com.agnotheist.model.services.exception.CreateBeliefException;
import com.agnotheist.model.services.exception.PostCommentException;

/**
 * @author mevans
 *
 */
public class CommentServiceImpl implements ICommentService {

	@Override
	public boolean postComment(User user, Belief belief, String comment) throws PostCommentException {
		boolean isValid = false;
		ObjectInputStream input = null;
		ObjectOutputStream output = null;
		
		
		try {
			output = new ObjectOutputStream(
					new FileOutputStream("CreatedComment.out")
					);
			
			
			input = new ObjectInputStream(new FileInputStream("CreatedComment.out"));
			Comment savedComment = (Comment) input.readObject();
			
			
			if (user != null && belief != null && comment != null) {
				Comment newComment = new Comment(user, belief, comment);
				output.writeObject(newComment);
				isValid = true;
			} else { 
				if (user == null) {
					isValid = false;
					throw new PostCommentException("Null or invalid user passed to CommentServiceImpl::postComment");
				} 
				if (belief == null) {
					isValid = false;
					throw new PostCommentException("Null or invalid belief passed to CommentServiceImpl::postComment");
				}
				if (comment == null) {
					isValid = false;
					throw new PostCommentException("Null or invalid comment passed to CommentServiceImpl::postComment");
				}	
			}
		} catch(PostCommentException pce) {
			isValid = false;
			throw new PostCommentException("Comment could not be posted", pce);
		}catch(IOException ioe) {
			isValid = false;
			throw new PostCommentException("IOException while accessing file containing comment", ioe);
		} catch(ClassNotFoundException cnfe) {
			isValid = false;
			throw new PostCommentException("ClassNotFoundException while reading file containing comment", cnfe);
		} finally {
			if (input != null) {
				try {
					output.flush();
					output.close();
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return isValid;
	}

}
