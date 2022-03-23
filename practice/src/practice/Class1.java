package practice;

public class Class1 {
public void method1(Class2 class2) {
	System.out.println("I am in class1 method1");
	try {Thread.sleep(100);} catch (Exception e) {}
	class2.Method2();
}
public void Method2() 
{
System.out.println("I am in Class1 Method1");	
}
}
