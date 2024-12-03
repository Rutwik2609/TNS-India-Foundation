package com.tnsif.dayeight.interfaceddemo;

public class bankDemo {

	public static void main(String[] args) {

		SavingAccount s1=new SavingAccount("Shubham", "pune", 12345, 12500);
		
		s1.deposit(26000);
		System.out.println(s1);
		
		s1.withdraw(8000);
		System.out.println(s1);
	}

}
