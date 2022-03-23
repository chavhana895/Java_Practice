package deadLock;

public class sixthClass 
{
   public static synchronized void m1() 
    {
	  System.out.println("6-1");
	  try {Thread.sleep(1000);} catch (Exception e) {}
	  fifthClass.m2();
    }
   
   public static synchronized void m2() 
   {
	  System.out.println("6-2");
   }
}
