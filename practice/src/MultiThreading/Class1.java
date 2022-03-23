package MultiThreading;

public class Class1 {
public synchronized void Method1(Class2 class2) 
{   System.out.println("I am in class1 method1");
	try {Thread.sleep(100);
	} catch (Exception e) {}
	class2.Method2();
}
public synchronized void Method2() 
{
	
		System.out.println("I am in class1 method2");
}
}
