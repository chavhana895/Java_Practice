
public class Thread1 extends Thread 
{
	public void run() 
	{
		for (int i = 0; i < 100000; i++) 
		{
			System.out.println("Hi");
			try {Thread.sleep(100);} catch (Exception e) {}
		}
	}
}
