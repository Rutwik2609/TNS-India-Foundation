package com.tnsif.dayfive.multlevelinheritance;
//child of state
public class City extends State{

	
	//data members
	
	private String cityName;
	private long PopulationCity;
	
	public City() {
		super();
	}
	public City(String countryName, String countrycapital, int countrycode, String stateName, String language, String stateCapital, String cityName, long populationCity) {
		super( countryName,  countrycapital,  countrycode,  stateName,  language,  stateCapital);
		this.cityName = cityName;
		PopulationCity = populationCity;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public long getPopulationCity() {
		return PopulationCity;
	}
	public void setPopulationCity(long populationCity) {
		PopulationCity = populationCity;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", PopulationCity=" + PopulationCity + ", getStateName()="
				+ getStateName() + ", getLanguage()=" + getLanguage() + ", getStateCapital()=" + getStateCapital()
				+ ", getCountryName()=" + getCountryName() + ", getCountrycapital()=" + getCountrycapital()
				+ ", getCountrycode()=" + getCountrycode() + "]";
	}
	
	
	
	
	
}
