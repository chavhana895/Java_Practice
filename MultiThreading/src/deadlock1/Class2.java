package deadlock1;

public class Class2 
{
	public synchronized void method1(Class1 class1)
	{
		System.out.println("I am in class2 Method1");
		try {Thread.sleep(100);} catch (Exception e) {}
		class1.method2();
	}
	public synchronized  void method2()
	{
		System.out.println("I am in class2 Method2");
	}
}