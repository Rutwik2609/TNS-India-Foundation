package com.tnsif.dayfive.association.hasa;

//              has a
// Person -------------------- Address

//container class
public class Person {

	//data members
	private String name;
	private Address address; //object reference 
	
	
	//para
	public Person(String name, Address address) {
		
		this.name = name;
		this.address = address;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void displayinfo()
	{
		System.out.println("Name: "+name);
		System.out.println("Address: "+address.getCity()+address.getFlatno()+address.getPostalCode()
		+address.getState()+address.getStreet());
	}
	
	
}
