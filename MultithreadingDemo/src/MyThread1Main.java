
public class MyThread1Main {

	public static void main(String[] args) 
	{
		Mythread1 thread1=new Mythread1();
		thread1.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Main Thread: i="+i);
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
