package com.cg.synch.demos;

public class Producer extends Thread
{
	private Resource rc;
	public Producer(Resource rc)
	{
		this.rc=rc;
	}
	@Override
	public void run()
	{
		for(int i=1;i<=20;i++)
		{
		int val=(int)(Math.random()*100);
		rc.insert(val);
		//System.out.println("Inserted....."+val);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}	
}
