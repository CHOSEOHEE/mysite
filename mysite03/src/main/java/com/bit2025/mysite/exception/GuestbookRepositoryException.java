package com.bit2025.mysite.exception;

public class GuestbookRepositoryException extends RuntimeException {
	private static final long serialversionUID = 1L;
	
	public GuestbookRepositoryException() {
		super("GuestbookRepositoryException Occurs");
	}
	
	public GuestbookRepositoryException(String message) {
		super(message);
	}	
}
