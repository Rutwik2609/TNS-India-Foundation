package com.tnsif.dayfourteen.synhronization;

public class DepositLimitedExceedException extends Exception {
	
	public DepositLimitedExceedException()
	{
		super("Daily limit of deposit is exceeded......");
	}
	
	public DepositLimitedExceedException(String message)
	{
		super(message);
	}

}
