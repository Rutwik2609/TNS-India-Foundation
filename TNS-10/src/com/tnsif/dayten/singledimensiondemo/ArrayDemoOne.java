package com.tnsif.dayten.singledimensiondemo;

import java.lang.reflect.Array;

class ArrayOperations
{
	
	//print int array
	static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+ " ");
		}	
	}
	
	//varible argument function
	
	public static int getSum(int... n)
	{
		int sum=0;
		for(int no : n)
		
			sum+=no;
			return sum;
		
	}
	
	//count no of odd elements 
	public static int getOddCount(int b[])
	{
		int count=0;
		for(int i=0; i<b.length; i++)
		{
			if (b[i] % 2 !=0)
				count++;
		}
		return count;
	}
	
	
	//count no. of even elemnets
	public static int getEvenCount(int b[])
	{
		return b.length-getOddCount(b);
	}
	
	
}


public class ArrayDemoOne {

	public static void main(String[] args) {

		int n=10;
		int a[]; //declaration 
		
		a=new int[n]; //instatntiation 
		
		//displayiny the array
		ArrayOperations.printArray(a);
		
		//assigning the arrays
		for(int i=0; i<a.length; i++)
			a[i]=5*1;
		ArrayOperations.printArray(a);
		
		
		
		int b[] = {10,20,30,40,50}; //initialization atthe time of declaration
		ArrayOperations.printArray(b);
		
		//calling varible arguments function
		System.out.println("Sum of arrays elemnts is :"+ ArrayOperations.getSum(b));
		System.out.println("Sum of arrays elemnts is :"+ ArrayOperations.getSum(10,56,76,87,98,90));

		
		b[2]=999;
		//b[20]=60; //RTE
		ArrayOperations.printArray(b);
		
		//display total no of odd and even 
		
		System.out.println("Odd number "+ArrayOperations.getOddCount(b)+ "\t Even number : "+ ArrayOperations.getEvenCount(b));
		System.out.println("----------------------");
		
		int c[];
	//	ArrayOperations.printArray(c); CTE
		
		
	}

}
