package join;

public class MyThreadTwo extends Thread {
public void run()
{
	for (int i = 0; i < 1000; i++) 
	{
		Thread.yield();
		System.out.println("hello");
	}
}
}
