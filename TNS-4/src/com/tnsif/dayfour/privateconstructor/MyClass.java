package com.tnsif.dayfour.privateconstructor;

//Make a constructor private 
//Write a static method that has the return type object of this singleton class
//


public class MyClass {

	//MyClass obj=new MyClass(); //early Instatiation
	
	
	private MyClass()
	{
		System.out.println("MyClass object is created ");
	}
	
	private static MyClass obj=null;
	
	public static MyClass getObject()
	{
		if(obj==null)
		{
			obj=new MyClass();  //LazyInstantiation
		}
		return obj;
	}
}
