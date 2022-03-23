package deadLock;

public class Class1 
{
public static synchronized void m1() 
{
	System.out.println("Class1 - Method1");
}

public static synchronized void m2() 
{
	System.out.println("Class1 - Method2");
}
}
