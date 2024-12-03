package com.tnsif.dayseven.runtimeDemo;

public class Overridingdemo {

	public static void main(String[] args) {

		RBI rbi; // Dynamic Binding
		
		
		rbi=new RBI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new Axis();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new ICICI();
		System.out.println(rbi.getRateofInterest());
		
		rbi=new HDFC();
		System.out.println(rbi.getRateofInterest());
		
		
	}

}
