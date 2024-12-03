package com.tnsif.daynine.stringdemo;

public class StringComparison {

	public static void main(String[] args) {

		//creating strings using literals // pool memory
		
		String s1="TNSIF";
		String s2="TNSIF";
		
		//creating new operator // heap memory
		String s3=new String("TNSIF");
		String s4=new String("TNSIF");
		
		//== & equals
		////==-> object reference
		// equals --> data
		
		
		System.out.println("Case 1:"+ (s1==s2));//true
		System.out.println("Case 2"+ (s1==s3));//false
		System.out.println("Case 3"+ (s2.equals(s1)));//true
		System.out.println("Case 4"+ (s2.equals(s4)));//true
		System.out.println("Case 5"+ (s3==s4)); //false
		System.out.println("Case 4"+ (s3.equals(s4)));//true
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		System.out.println(s1.compareTo("TNIF"));  //unicode values
		
		System.out.println(s1.compareToIgnoreCase("tnsif"));
		
		
		
		
	}

}
