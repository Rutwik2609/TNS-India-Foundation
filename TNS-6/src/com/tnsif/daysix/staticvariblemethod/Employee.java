package com.tnsif.daysix.staticvariblemethod;

public class Employee {

	
	//declare instancre varibles
	private String name;
	private int id;
	
	//Declare a static varibles companyName; with data type string 
	
	//TNS which is common for all
	static String companyName="TNS";

	//Decalre a two Parameter constructor 
	public Employee(String name, int id) {
		
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", Company =" +companyName+"]";
	}
	
	
	
	
	
	
	
	
	
}
