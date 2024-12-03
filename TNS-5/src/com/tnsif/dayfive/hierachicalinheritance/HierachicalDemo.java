package com.tnsif.dayfive.hierachicalinheritance;

public class HierachicalDemo {

	public static void main(String[] args) {

		
		Person P=new Person();
		
		System.out.println("person  class details .....");
		System.out.println(P);
		
		//Student s=new Student();
		
		Person p1; //object refernce 
		
		p1=new Person("Shubham", "Mumbai", 25);
		if(p1 instanceof Person)
		{
			System.out.println(p1);
		}
		
		p1=new Student("Yogesh", "Delhi", 23, 1001, "IT", "JSPM");
		if(p1 instanceof Person)
		{
			System.out.println(p1);
		}
		p1=new Employee("Aditya", "Nashik", 22, 001, "TNS", "SD", 12345);
		if(p1 instanceof Person)
		{
			System.out.println(p1);
		}
				
				
		
		
	}

}
