package com.tnsif.dayfive.SingleInheritance;

public class Citizen {

	private String name;
	private String adharNo;
	private String address;
	private long phone;
	
	
	//para constructor
	public Citizen(String name, String adharNo, String address, long phone) {
	System.out.println("Citizen object created para constructor");
		this.name = name;
		this.adharNo = adharNo;
		this.address = address;
		this.phone = phone;
	}

//Non para constructor
	public Citizen() {
		System.out.println("Citizen object created Non para constructor");

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(String adharNo) {
		this.adharNo = adharNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
	
}
