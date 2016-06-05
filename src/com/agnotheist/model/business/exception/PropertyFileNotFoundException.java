package com.agnotheist.model.business.exception;

public class PropertyFileNotFoundException extends Exception {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 
	 * @param inMessage
	 * @param inNestedException
	 */
	public PropertyFileNotFoundException(final String inMessage, final Throwable inNestedException) {
		super(inMessage, inNestedException);
	}
}
