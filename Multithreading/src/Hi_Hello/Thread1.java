package Hi_Hello;

public class Thread1 extends Thread 
{
 Class1 class1;

public Thread1(Class1 class1) 
{
	this.class1 = class1;
}
@Override
	public void run() 
{
	while(true)
	{
		class1.Hi();
		try {Thread.sleep(10);} catch (Exception e) {}
	}
	}
 
}
