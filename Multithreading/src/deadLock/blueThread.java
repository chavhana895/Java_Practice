package deadLock;

public class blueThread extends Thread 
{
  @Override
public void run() 
  {
     fifthClass.m1();
  }
}
