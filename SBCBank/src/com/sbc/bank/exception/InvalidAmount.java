package com.sbc.bank.exception;

public class InvalidAmount extends Exception{
	public InvalidAmount() {
			super("*****Invalid Amount*****"
					+ "Amount can't be negative..."
					+ "Amount can't be zero :)");
	}
}
