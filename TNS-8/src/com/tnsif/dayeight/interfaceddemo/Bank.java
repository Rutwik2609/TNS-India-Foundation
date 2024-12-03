package com.tnsif.dayeight.interfaceddemo;

public interface Bank {

	
	
	final static float MINBAL=5000;
	final static float Deposit_Limit=25000;
	
	public void deposit(float amount);
	public void withdraw(float amount);
}
