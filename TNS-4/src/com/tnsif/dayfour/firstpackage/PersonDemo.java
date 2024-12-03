package com.tnsif.dayfour.firstpackage;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {

		Person P1=new Person();
		
		Scanner sc= new Scanner(System.in);
		
		String name, city;
		
		int age;
		System.out.println("Enter Person details: Name , Age, City");
		
		name=sc.nextLine();
		age=sc.nextInt();
		city=sc.nextLine();
		
		P1.setPersonName(name);
		P1.setPersonCity(city);
		P1.setPersonAge(age);
		
		System.out.println(P1.getPersonName());
		System.out.println(P1.getPersonAge());
		System.out.println(P1.getPersonCity());
		
		
		
		
		
		
		
		
	}

}
