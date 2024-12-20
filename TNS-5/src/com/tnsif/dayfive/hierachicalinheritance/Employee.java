package com.tnsif.dayfive.hierachicalinheritance;

public class Employee extends Person{

	
	//data members
	private int Empid;
	private String companyName;
	private String designation;
	private float salary;
	
	//default constructor 
	public Employee() {
		super();
		
		System.out.println("Employee constructor ");
	}

	//para
	public Employee(String name, String city, int age,int empid, String companyName, String designation, float salary) {
		super( name,  city,  age);
		this.Empid = empid;
		this.companyName = companyName;
		this.designation = designation;
		this.salary = salary;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", companyName=" + companyName + ", designation=" + designation
				+ ", salary=" + salary + ", getName()=" + getName() + ", getCity()=" + getCity() + ", getAge()="
				+ getAge() + "]";
	}
	
	
	
	
	
	
	
	
}
