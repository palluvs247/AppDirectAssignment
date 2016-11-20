package com.appdirect.subscription.business.exception;

public class UnknownErrorException extends RuntimeException  {
	
	private static final long serialVersionUID = 1L;
	
	public UnknownErrorException() {
        super();
    }

    public UnknownErrorException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public UnknownErrorException(final String message) {
        super(message);
    }

    public UnknownErrorException(final Throwable cause) {
        super(cause);
    }



}
