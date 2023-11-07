package com.kodnest.ExceptionHandlingLevel2;

public class InsufficientFundsException extends Exception {
	public InsufficientFundsException() {
		super();
	}

	public InsufficientFundsException(String s) {
		super(s);
	}
}
