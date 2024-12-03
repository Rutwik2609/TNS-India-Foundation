package com.tnsif.daynine.stringdemo;

public class SampleStringDemo {

	public static void main(String[] args) {

		//initalize String
		
		
		char c[]= {'I','n','d','i','a'};
		
		//==  equalsTo
		String s1=new String(c);
		String s2=new String(s1);
		System.out.println(s1);
		
		System.out.println(s2);
		
		//concatenation to prevent long lines 
		String longstr="This is to show "+ " how long sentences"+" can be printed";
		
		
		System.out.println(longstr);
		
		
	}

}
