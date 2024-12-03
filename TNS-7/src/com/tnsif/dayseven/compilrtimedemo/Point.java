package com.tnsif.dayseven.compilrtimedemo;

public class Point {

	
	private float x;
	private float y;
	
	
	
	//default constructor
	public Point() {
		
		x = 0.0f;
		y = 0.0f;
	}


//para constructor
	public Point(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}



	//to string get the object
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
	
	
	
	
	
}
