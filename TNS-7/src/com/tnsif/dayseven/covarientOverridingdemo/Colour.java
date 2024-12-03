package com.tnsif.dayseven.covarientOverridingdemo;

public class Colour {

	protected Colour getColour()
	{
		Colour s=new Colour();
		return s;
	}
}

//child class
class Red extends Colour{
	
	@Override
	protected Red getColour()
	{
		Red s=new Red();
		return s;
	}
}


//child class
class Green extends Colour{
	
	@Override
	protected Green getColour()
	{
		Green s=new Green();
		return s;
	}
}






