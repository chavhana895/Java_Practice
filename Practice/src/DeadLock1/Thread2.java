package DeadLock1;

public class Thread2 extends Thread 
{
  @Override
public void run() {
Class2.m1();
}
}
