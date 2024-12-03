package com.tnsif.dayeleven.trycatch;

public class TryCatchExample {
	
	
	static void performDivision(int x, int y)
	{
		System.out.println("I am in method");
		int z;
		try {
			
			System.out.println("I am in try block ");
			
		z=x/y;
		System.out.println("Result of z:"+ z);  // this msg will be printed 
		
		}
		catch(ArithmeticException e)
		{
			System.err.println("I am in catch block :"+ e.getMessage());
		}
		
		System.out.println("End of the program");
	}
	


}
