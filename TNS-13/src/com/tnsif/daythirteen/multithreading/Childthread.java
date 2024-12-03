package com.tnsif.daythirteen.multithreading;

public class Childthread extends Thread {

	
	int n;
	String msg;
	
	public Childthread(int n, String msg)
	{
		this.n=n;
		this.msg=msg;
	}
	
	public void run()
	{
		for(int i=1; i<n;i++)
		{
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			System.out.println(i + msg);
		}
		
	}
	
	
	
	
	
	
	
}
