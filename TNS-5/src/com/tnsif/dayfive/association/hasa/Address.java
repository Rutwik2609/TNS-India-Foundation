package com.tnsif.dayfive.association.hasa;


//contained class
public class Address {

	
	//data members
	private String street;
	private String city;
	private String state;
	private int flatno;
	private String postalCode;
	
	//default constructor 
	public Address() {
		super();
	}

	//para
	public Address(String street, String city, String state, int flatno, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.flatno = flatno;
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getFlatno() {
		return flatno;
	}

	public void setFlatno(int flatno) {
		this.flatno = flatno;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + ", state=" + state + ", flatno=" + flatno
				+ ", postalCode=" + postalCode + "]";
	}
	
	
	
	
	
	
	
	
}
