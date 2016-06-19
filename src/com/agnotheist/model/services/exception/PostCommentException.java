/**
 * 
 */
package com.agnotheist.model.services.exception;

/**
 * @author mevans
 *
 */
public class PostCommentException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1503589650727156280L;
	
	public PostCommentException(final String message) {
		super(message);
	}

	/**
	 * 
	 * @param message
	 * @param inNestedException
	 */
	public PostCommentException(final String message, final Throwable inNestedException)
	{
		super(message, inNestedException);
	}
	
}
