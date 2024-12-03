package com.tnsif.dayseven.covarientOverridingdemo;

public class StudentDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Student s1=new Student(101, "Shivam", "IT");
		s1.print();
		
		Student s2=s1.clone();
		s2.setRollNo(1001);
		s2.setBranch("CS");
		s2.setName("Shubham");
		
		s2.print();
		
		
		
		
		
		
	}

}
