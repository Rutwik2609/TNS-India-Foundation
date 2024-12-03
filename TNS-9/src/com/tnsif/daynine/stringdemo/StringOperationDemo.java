package com.tnsif.daynine.stringdemo;

public class StringOperationDemo {

	public static void main(String[] args) {

		
		String s1=new String ("  Indian ");
		
		System.out.println(s1);
		String s2=s1.toUpperCase();
		System.out.println(s2);
		System.out.println(s1.length());
		int a=s2.length();
		System.out.println("length is "+ a);
		String s3=s1.substring(1, 7);

		System.out.println(s3);
		
		System.out.println(s1.trim());
		System.out.println(s1.stripTrailing());
		System.out.println(s1.isEmpty());
		
		//String Comparison
		
		s1="Good Morning Students";
		s2=new String(s1);
		
		
		//== check the memory hashcode values address
		//equals check the values or the data is same or not

		
		
		System.out.println("Case 1:" +s1.equals(s2)); //true
		System.out.println("Case 2:" + s1==s2);// false
		
		
		
		
	}

}
