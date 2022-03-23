package Q8;

public class Class1 extends Thread {
public synchronized void Method1(Class2 class2) 
{
	System.out.println("I am in class1 Method1");
	try {Thread.sleep(10);} catch (Exception e) {}
	class2.Method1(class2);
	
}
public synchronized void Method2()
{
	System.out.println("I am in class1 Method2");
}
}
