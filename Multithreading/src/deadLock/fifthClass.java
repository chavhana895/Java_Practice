package deadLock;

public class fifthClass 
{
	public static synchronized void m1() 
    {
	  System.out.println("5-1");
	  try {Thread.sleep(1000);} catch (Exception e) {}
	  sixthClass.m2();
    }
	
	public static synchronized void m2() 
    {
	  System.out.println("5-1");
    }
}
