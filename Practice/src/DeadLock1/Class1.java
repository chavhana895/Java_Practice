package DeadLock1;

public class Class1 
{
 public static synchronized void m1() 
 {
	System.out.println("Class-1    Method-1");
	try {Thread.sleep(100);} catch (Exception e) {}
	Class2.m2();
  }
 
 public static synchronized void m2() 
 {
	System.out.println("Class-1    Method-2");
  }
}
