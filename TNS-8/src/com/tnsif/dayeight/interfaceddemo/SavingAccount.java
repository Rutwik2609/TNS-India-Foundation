package com.tnsif.dayeight.interfaceddemo;

public class SavingAccount extends Customer implements Bank{

	private int accNo;
	private float balance;
	
	
	
	
	
	public SavingAccount(String name, String city, int accNo, float balance) {
		super(name, city);
		this.accNo = accNo;
		this.balance = balance;
	}
	
	

	public int getAccNo() {
		return accNo;
	}



	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}



	public float getBalance() {
		return balance;
	}



	public void setBalance(float balance) {
		this.balance = balance;
	}



	@Override
	public void deposit(float amount) {

		if(amount < 0 || amount > Deposit_Limit)
		{
			System.out.println("Please Deposit valid amount");
		}
		else
		{
			balance += amount;
			System.out.println("Rs:" + amount+"is deposited succcessfully");
		}
		
		
	}

	@Override
	public void withdraw(float amount) {
		
		if(amount<=balance-MINBAL)
		{
			balance-=amount;
			System.out.println("Rs: "+amount+"withdrawal succesfully");
		}
		else
		{
			System.out.println("Insufficient balance ");
		}

	}

	@Override
	public String toString() {
		return "SavingAccount [accNo=" + accNo + ", balance=" + balance + ", getName()=" + getName() + ", getCity()="
				+ getCity() + "]";
	}
	

}
