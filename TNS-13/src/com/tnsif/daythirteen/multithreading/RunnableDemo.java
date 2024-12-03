package com.tnsif.daythirteen.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {

		
			
			
		
		UsingRunnable r1=new UsingRunnable(10, 1, "Hii");
//		
//		
//		Thread t1=new Thread(r);
//		
//		t1.start();
		
		Runnable r11=() -> System.out.println("runnable with lamba expression ");
		
		new Thread(r11).start();
		
	}

}
