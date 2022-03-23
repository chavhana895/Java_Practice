package DeadLock1;

public class Class2 
{
	public static synchronized void m1() 
	 {
		System.out.println("Class-2    Method-1");
		try {Thread.sleep(100);} catch (Exception e) {}
		Class1.m2();
	  }
	
	public static synchronized void m2() 
	 {
		System.out.println("Class-2    Method-2");
	  }
}
