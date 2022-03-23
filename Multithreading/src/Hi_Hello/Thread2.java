package Hi_Hello;

public class Thread2 extends Thread 
{
 Class1 class1;

public Thread2(Class1 class1) 
{
	this.class1 = class1;
}
 @Override
	public void run() 
    {
		class1.Hello();
		try {Thread.sleep(10);} catch (Exception e) {}
	}
}
