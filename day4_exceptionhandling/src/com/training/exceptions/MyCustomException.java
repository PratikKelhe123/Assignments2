package com.training.exceptions;

public class MyCustomException extends Exception {
		
	private String message;

	public MyCustomException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
		this.message = message;
	}

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Exception:" + message + super.getMessage() ;
	}
	
}
