
public class MyThread2Main {

	public static void main(String[] args) 
	{
		Thread thread=new Thread(new MyThread2());
		thread.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main i="+i);
			try {
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			if(i==5)
			{
				try 
				{
					thread.join();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
		}

	}

}
