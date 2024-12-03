package com.tnsif.dayeleven.multiplecatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {

	public static void divide()
	{
		int a,b,c;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		try {
			a=sc.nextInt();
			b=sc.nextInt();
			
			c=a/b;
			System.out.println("Division is "+ c);
		}
		catch (ArithmeticException e)
		{
			System.err.println("ArithmeticException "+ e.getMessage());
		}
		
		catch (InputMismatchException e)
		{
			System.err.println("Invalid input. Please enter integer values "+ e.getMessage());
		}
		
		catch (ArrayIndexOutOfBoundsException e)
		{
			System.err.println("Exception caught"+e.getMessage());
		}
		
		catch (Exception e)
		{
			System.out.println("Exception cought:"+ e.getMessage());
		}
		
		finally {
		   sc.close();
			
		   
		   System.out.println("Finally Block   Thank U ");
		}
		
		System.out.println("Statement afer finally block ");
	}
}
