package com.learnings.payments.gateway.exception;


/**
 * 
 * @author amchandra
 * Builds application specific exception to by encapsulating the underlying third party error to
 * be thrown to client 
 *
 */
public class GatewayException extends RuntimeException {

	private static final long serialVersionUID = 0;

	public GatewayException(String message) {
		super(message);
	}

	public GatewayException(Throwable cause) {
		super(cause);
	}

	public GatewayException(String message, Throwable cause) {
		super(message, cause);
	}
}
