package com.tnsif.daytwelve.throwsexceptionDemo;

public class greaterValueException extends Exception {

	
	public greaterValueException(String string)
	{
		super();
	}
	public greaterValueException()
	{
		super("Percentage should not be greater then 100");
	}
}
