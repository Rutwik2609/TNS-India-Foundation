package com.tnsif.daynine.stringdemo;

public class StringBufferDemo {

	public static void main(String[] args) {

		//String buffer lenght
		
		StringBuffer buffer=new StringBuffer("Hello");
		System.out.println("Buffer = "+buffer);
		System.out.println("Lenght = "+ buffer.length());
		System.out.println("Capacity ="+ buffer.capacity());
		
		
		//appending and inserting into stringbufer
		
		String s;
		int a=42;
		buffer=new StringBuffer(40);
		s=buffer.append("a= ").append(a).append("!").toString();
		System.out.println(s);
		
		buffer=new StringBuffer("I Java!");
		buffer.insert(2, "like ");
		System.out.println(buffer);
		
		buffer.delete(3, 6);
		System.out.println(buffer);
		System.out.println(buffer.reverse());
		
		
	}

}
