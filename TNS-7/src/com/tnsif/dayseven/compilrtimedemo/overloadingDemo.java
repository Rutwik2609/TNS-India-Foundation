package com.tnsif.dayseven.compilrtimedemo;

public class overloadingDemo {

	public static void main(String[] args) {

		
		Point p1=new Point();
		System.out.println(p1);
		
		Point p2=new Point(1.58f, 2.98f);
		System.out.println(p2);
		
		System.out.println("------------------------");
		
		//Overloading Of method
		
		MethodOverloadingDemo m=new MethodOverloadingDemo();
		
		System.out.println(m.addition(12, 14));
		System.out.println(m.addition(12.56f, 23.43f));
		System.out.println(m.addition(20, 33.3333f, 13));


		
	}

}
