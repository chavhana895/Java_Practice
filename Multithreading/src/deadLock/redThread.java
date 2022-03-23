package deadLock;

public class redThread extends Thread 
{
   @Override
public void run() 
   {
	sixthClass.m1();
}
}
