package com.tnsif.daytwelve.throwsexceptionDemo;

import java.util.Scanner;

public class UsingThrow {

	
	static int acceptNumber()
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		return n;	}
	public static void main(String[] args) {
	
		int per;
		System.out.println("enter your percentage.....");
		per=acceptNumber();
		try {
			if(per<0)
				throw new negativeException();
			
			else if(per>100)
				throw new greaterValueException();
			else
				System.out.println("Valid Percentage......");
		}
		catch (negativeException | greaterValueException ae)
		{
			System.err.println("Error......"+ ae.getMessage());
		}

	}

}
