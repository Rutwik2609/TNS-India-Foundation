package com.tnsif.dayfive.multlevelinheritance;


//child of Country
public class State extends Country{

	
	
	private String stateName;
	private String Language;
	private String stateCapital;
	
	//default 
	public State() {
		super();
	}
	
	//para 
	public State(String countryName, String countrycapital, int countrycode, String stateName, String language, String stateCapital) {
		super( countryName,  countrycapital,  countrycode);
		this.stateName = stateName;
		this.Language = language;
		this.stateCapital = stateCapital;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getStateCapital() {
		return stateCapital;
	}

	public void setStateCapital(String stateCapital) {
		this.stateCapital = stateCapital;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", Language=" + Language + ", stateCapital=" + stateCapital
				+ ", getCountryName()=" + getCountryName() + ", getCountrycapital()=" + getCountrycapital()
				+ ", getCountrycode()=" + getCountrycode() + "]";
	}
	
	
	
	
}
