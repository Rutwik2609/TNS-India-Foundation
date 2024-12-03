package com.tnsif.dayfive.multlevelinheritance;
//Parent class
public class Country {

	//data members
	private String countryName;
	private String countrycapital;
	private int countrycode;
	
	//default 
	public Country() {
		System.out.println("Default constructor");
	}
	
	//para constructor
	public Country(String countryName, String countrycapital, int countrycode) {
		super();
		this.countryName = countryName;
		this.countrycapital = countrycapital;
		this.countrycode = countrycode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountrycapital() {
		return countrycapital;
	}
	public void setCountrycapital(String countrycapital) {
		this.countrycapital = countrycapital;
	}
	public int getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(int countrycode) {
		this.countrycode = countrycode;
	}
	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", countrycapital=" + countrycapital + ", countrycode="
				+ countrycode + "]";
	}

	
	
	
	
	
}
