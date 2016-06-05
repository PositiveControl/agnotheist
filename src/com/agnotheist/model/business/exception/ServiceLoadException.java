package com.agnotheist.model.business.exception;

@SuppressWarnings("serial")
public class ServiceLoadException extends Exception {
	
	/**
	 * 
	 * @param inMessage
	 * @param inNestedException
	 */
	public ServiceLoadException(final String inMessage, final Throwable inNestedException)
	{
		super(inMessage, inNestedException);
	}
}
