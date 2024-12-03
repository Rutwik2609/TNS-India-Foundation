package com.tnsif.daysix.usingFinal;

public class FinalVarible {

	
	//final int q;  //final varibles must be initialized 

	final int x=100;
	
	//declare a static blank final 
	
	final static int y;
	
	//Decalre a static varible and initailized that varible
	
	final static int z=10;
	
	
	//instance method 
	void change()
	{
		//x = 30; //final varible can't be reassigned 
	//	y = 200; //final varible can't be assign
		
	}


	@Override
	public String toString() {
		return "FinalVarible [x=" + x + ", y=" + y +"]";
	}
	
	//declare a static block to intialize the final varible
	
	static {
		
		y=20;
		
		//x=100;
		System.out.println("value of Y :" +y);
	}




}
