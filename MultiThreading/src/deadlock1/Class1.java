package deadlock1;

public class Class1 {
public synchronized void method1(Class2 class2)
{
	System.out.println("I am in class1 Method1");
	try {Thread.sleep(100);} catch (Exception e) {}
	class2.method2();
}
public synchronized void method2()
{
	System.out.println("I am in class1 Method2");
}
}
