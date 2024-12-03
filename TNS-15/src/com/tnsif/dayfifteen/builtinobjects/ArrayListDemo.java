package com.tnsif.dayfifteen.builtinobjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		List list=new ArrayList();  //dynamic binding
		
		System.out.println(list.isEmpty());
		
		list.add(10);
		list.add(20);
		list.add("Sakshi");
		list.add("atharv");
		list.add(false);
		list.add(true);
		list.add(20);
		list.add(12.41f);
		list.add(10);
		
		System.out.println("List is  "+list);
		System.out.println(list.isEmpty());
		System.out.println(list.size());
		
		System.out.println("is list contains 10?"+list.contains(10));
		
		list.remove(false);
		System.out.println("List is  "+list);
		
		list.remove(2);
		System.out.println("List is  "+list);
		
		System.out.println(list.remove(list.lastIndexOf(20)));
		System.out.println("List is  "+list);
		
		System.out.println( list.indexOf(20));
		
		list.clear();
		System.out.println("List is  "+list);
		
		System.out.println("-------------------------------------");
		
		
		//Generics
		
		List<String> names=new ArrayList<>();
		
		names.add("Aakash");
		names.add("Avinash");
		names.add("20");
		names.add("Heti");
		names.add("zeel");
		names.add("Vikrant");
		names.add("Aakash");
		
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		System.out.println(names.contains("Dilip"));
		
		Collections.sort(names);
		System.out.println(names);
		
		Collections.reverse(names);
		System.out.println(names);
		
		//Traversing alist
		
		Iterator<String> i=names.iterator();
		while(i.hasNext())
		{
			String nm=i.next();
			System.out.println(nm);
			if(nm.equals("Prachi"))
				i.remove();
		}

		System.out.println(names);
		
		ListIterator<String> li=names.listIterator(names.size());
		
		while(li.hasPrevious())
		{
			String nm=li.previous();
			System.out.println(nm);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
