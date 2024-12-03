package com.tnsif.daysix.staticblockmethod;

public class MyClass {

	private int section; // non-static or instance varible 
	
	private static int srNo; // static or class varible 
	
	//static block 
	static 
	{
		System.out.println("-------Within static block--------");
		srNo=1000;
		
	}
	
	
	//default constructor 
	MyClass()
	{
		System.out.println("-----Within default cons------");
		srNo++;  //static intial value 1000  == 1001 === 1002
		section++; // non static intial value 0 ===1==1

	}


	@Override
	public String toString() {
		return "MyClass [serial No "+srNo+",section=" + section + "]";
	}
	
	//static method 
	static void display()
	
	{
	//	System.out.println("section :" + section()); can't access non static member
	
	System.out.println("serail No :"+srNo);
	
	
	}
	
	
	
}
