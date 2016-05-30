package com.agnotheist.model.services.exception;

public class CreateBeliefException extends Exception {

	private static final long serialVersionUID = 1L;

	public CreateBeliefException(final String message) 
	{
		super(message);
	}
	
	public CreateBeliefException(final String message, final Throwable inNestedException)
	{
		super(message, inNestedException);
	}
}
