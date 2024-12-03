package com.tnsif.dayfourteen.synhronization;

public interface Bank {
	
	static final int MINBAL = 5000;
	static final int DAILY_LIMIT = 25000;
	void deposit (int amt)throws DepositLimitedExceedException;
	void withdraw(int amt) throws InsufficientBalanceException;

}
