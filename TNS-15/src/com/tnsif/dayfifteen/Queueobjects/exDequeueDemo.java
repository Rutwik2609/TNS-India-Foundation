package com.tnsif.dayfifteen.Queueobjects;

import java.util.ArrayDeque;
import java.util.Deque;

public class exDequeueDemo {

	public static void main(String[] args) {

		Deque<String> deque1=new ArrayDeque<String>();
		deque1.add("Gautam");
		deque1.add("kirti");
		deque1.add("Abhi");
		deque1.add("Rahul");
		
		System.out.println("Queue is :"+deque1);
		
		deque1.pollLast();
		System.out.println("Queue is :"+ deque1);
		
		deque1.pollFirst();
		System.out.println("Queue is :"+ deque1);
		
		for(String str:deque1)
		{
			System.out.println("Queue is : "+str);
		}
		
		System.out.println("Queue is :"+ deque1);
		
		
		
	}

}
