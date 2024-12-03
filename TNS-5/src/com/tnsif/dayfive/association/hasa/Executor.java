package com.tnsif.dayfive.association.hasa;

public class Executor {

	public static void main(String[] args) {

		Address a=new Address("Swargate", "Pune", "maha", 123, "411001");
		Person p=new Person("Shubham", a);
		p.displayinfo();
	
	}

}
