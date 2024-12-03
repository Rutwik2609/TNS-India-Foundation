package com.tnsif.dayeight.nestedInterface;

public class NestedDemo implements OuterInterface, OuterInterface.InnerInterface {

	@Override
	public void calArea() {
		System.out.println("Hellloooooo");
		System.out.println("Outer Interface ");
	}

	@Override
	public void print() {
		System.out.println("Inner Interface ");
		
	}

}
