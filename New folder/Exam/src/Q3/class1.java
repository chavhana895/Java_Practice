package Q3;

public class class1 
{

	public static synchronized void Method1() 
	{
		System.out.println("I am in:    class1  Method:1");
		try {Thread.sleep(100);} catch (Exception e) {}
		class2.Method2();
	}
	
	public static synchronized void Method2() 
	{
		System.out.println("I am in:    class1  Method:2");
	}
}
