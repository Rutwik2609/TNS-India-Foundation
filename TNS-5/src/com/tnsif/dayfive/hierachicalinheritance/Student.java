package com.tnsif.dayfive.hierachicalinheritance;

public class Student extends Person {

	
	//data members
	
	private int rollNo;
	private String branch;
	private String collegeName;
	
	
	//default constructor
	public Student() {
		super();
		System.out.println("Student Constructor");
	}


	public Student(String name, String city, int age,int rollNo, String branch, String collegeName) {
		super( name,  city,  age);
		this.rollNo = rollNo;
		this.branch = branch;
		this.collegeName = collegeName;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}


	public String getBranch() {
		return branch;
	}


	public void setBranch(String branch) {
		this.branch = branch;
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", branch=" + branch + ", collegeName=" + collegeName + ", getName()="
				+ getName() + ", getCity()=" + getCity() + ", getAge()=" + getAge() + "]";
	}
	
	
	
	
	
	
	
	
	
}
