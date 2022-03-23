package Q3;

public class class2
{

	public static synchronized void Method1() 
	{
		System.out.println("I am in:    class2  Method:1");
		try {Thread.sleep(100);} catch (Exception e) {}
		class1.Method2();
	}
	
	public static synchronized void Method2() 
	{
		System.out.println("I am in:    class2  Method:2");
	}
}
