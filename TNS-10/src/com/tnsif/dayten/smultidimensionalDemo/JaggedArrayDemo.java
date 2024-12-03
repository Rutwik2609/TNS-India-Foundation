package com.tnsif.dayten.smultidimensionalDemo;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		int c[][]= { {10,20,30} , {40} , {12,24,26,48} , {10,11}};
		
		System.out.println("Total Rows in Array "+ c.length);
		
		JaddedArray.printArray(c);

	}

}
