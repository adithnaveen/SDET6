package com.fannie.exception;

// when you extent from exception class then it is eligilble to be throwable 
public class FannieException extends Exception {
	private String msg;
	
	public FannieException() {
		this.msg = "FannieMae Exception called without msg";
	}
	
	public FannieException(String msg){
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "FannieException [msg=" + msg + "]";
	}

	@Override
	public String getMessage() {
		return ":::::::::" + msg;
	}
	
	
}
