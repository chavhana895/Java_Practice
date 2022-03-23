package Thread_yield;

public class MyThreadTwo {
public void run()
{
	for (int i = 0; i < 1000; i++) 
	{
		Thread.yield();
		System.out.println("hello");
	}
}
}
