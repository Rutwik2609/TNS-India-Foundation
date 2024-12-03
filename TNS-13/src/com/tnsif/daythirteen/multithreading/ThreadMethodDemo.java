package com.tnsif.daythirteen.multithreading;

public class ThreadMethodDemo {

	public static void main(String[] args) {

		Childthread t1=new Childthread(5, "First");
		Childthread t2=new Childthread(10, "Second");
		
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent Thread");  //assign name to main thread as a parent name 
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY); // changing the priority of the thread 
		
		System.out.println("Current Thread: "+Thread.currentThread());
		try {
			
			t1.join(); // wait current thread until t1 is dead

			t2.join(); // wait current thread until t2 is dead 
		
		
		}
		catch (InterruptedException e)
		{
			Thread.currentThread().interrupt();  //Restore interrupted status
			System.err.println("Thread Interrup: "+e.getMessage());
		}
		System.out.println("-----------End of main --------------");
		
		
	}

}
