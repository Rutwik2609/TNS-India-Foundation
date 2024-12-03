package com.tnsif.dayseven.covarientOverridingdemo;

public class CovariantOverridingDemo {

	public static void main(String[] args) {

		Colour c=new Colour();
		System.out.println(c.getColour());
		
		Red r = new Red();
		System.out.println(r);
	}

}
