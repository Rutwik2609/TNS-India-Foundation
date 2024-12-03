package com.tnsif.daythirteen.multithreading;

public class Demo {

	public static void main(String[] args) {

		Thread  myThread=new ThreadLifeCycleDemo();
		System.out.println("Bedfore Runnable state threrad is aliove or not ?" 
		+ myThread.isAlive());
		
		myThread.start();
		
		try {
			Thread.sleep(400);
			
		}
		catch (InterruptedException e)
		{
			System.err.println(e);
		}
		System.out.println("After completion exceution, it is alive or not ?" 
		+myThread.isAlive());
		
		
		
	}

}
