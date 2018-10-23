package com.cg.synch.demos;
public class Consumer extends Thread
{
	private Resource rc;

	public Consumer(Resource rc) 
	{
		this.rc = rc;
	}
	@Override
	public void run() 
	{
		for(int i=1;i<=20;i++)
		{
			int val=rc.retrieve();
			//System.out.println("Retrieved..."+val);
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{
			e.printStackTrace();
			}
		}
	}
}
