package com.tnsif.dayten.smultidimensionalDemo;

public class ArrayObjectsDemo {

	public static void main(String[] args) {

		
		//declare an array integer;
		
		Student[] arr;
		
		
		
		//alocated memory for 5 objects of type srudent
		
		arr=new Student[5];
		
		for(int i=0; i<arr.length; i++)
//			System.out.println("Elements at "+ i + ": "+
//		arr[i].getRollNo()+" -- "+arr[i].getName());
		
		arr[0] =new Student(101, "Akash");
		arr[1] = new Student(102, "Heti");
		arr[2]=new Student(103, "Zeel");
		arr[3]=new Student(104, "Hema");
		arr[4]=new Student(105, "Aditya");
		
		for(int i=0; i<arr.length; i++)
			System.out.println("Elements at "+ i + ": "+
		arr[i].getRollNo()+" -- "+arr[i].getName());
		
		
		
	}

}
