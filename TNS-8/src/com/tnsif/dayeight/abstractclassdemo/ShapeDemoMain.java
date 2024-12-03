package com.tnsif.dayeight.abstractclassdemo;

public class ShapeDemoMain {

	public static void main(String[] args) {

		
		Square s=new Square();
		s.calArea();
		s.show();
		
		Rectangular r=new Rectangular();
		r.calArea();
		r.show();
		
		
		//dynamic binding
		
		
		Shape s1;
		
		s1=new Square(5.0f);
		s1.calArea();
		s1.show();
		
		s1=new Rectangular(10.0f, 12.0f);
		s1.calArea();
		s1.show();
		
		
		
		
		
		
		
		
	}

}
