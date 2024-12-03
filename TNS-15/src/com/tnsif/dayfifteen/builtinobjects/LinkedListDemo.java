package com.tnsif.dayfifteen.builtinobjects;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> li=new LinkedList<Integer>();
		
		li.add(10);
		li.add(20);
		li.add(40);
		System.out.println(li);
		li.addFirst(5);
		System.out.println(li);
		li.add(2, 60);
		System.out.println(li);
		
		li.addLast(54);
		System.out.println(li);

		System.out.println("First Elements is " +li.getFirst());
		System.out.println(li.getLast());
		
		li.removeFirst();
		li.removeLast();
		System.out.println(li);
		
		ListIterator<Integer> ll=li.listIterator()	;
		while(ll.hasNext())
			System.out.println(ll.next()+"\t");
		
		System.out.println();
			
	}

}
