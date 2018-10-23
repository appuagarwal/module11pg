package com.cg.synch.demos;

public class Resource 
{
	private int data;			//sharing data with two processes
	boolean dataAvailable=false;
	synchronized void insert(int data)
	{
		if(dataAvailable)
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
		else
		{
			
			this.data=data;
			System.out.println("Inserted..."+data);
			dataAvailable=true;
			notify();
		}
	}
	synchronized int retrieve()
	{
		if(!dataAvailable)
		{
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Retrieved..."+data);
			dataAvailable=false;
			notify();
			return this.data;
		
	}
}
