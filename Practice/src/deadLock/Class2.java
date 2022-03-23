package deadLock;

public class Class2 
{
	public static synchronized void m1() 
	{
		System.out.println("Class2 - Method1");
	}
	
	public static synchronized void m2() 
	{
		System.out.println("Class2 - Method2");
	}
}
