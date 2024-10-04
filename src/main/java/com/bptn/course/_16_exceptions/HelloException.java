package com.bptn.course._16_exceptions;

public class HelloException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public HelloException() {
		super();
	}

	public HelloException(String message) {
		super(message);
	}

	
}
