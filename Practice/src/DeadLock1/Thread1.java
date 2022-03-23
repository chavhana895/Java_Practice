package DeadLock1;

public class Thread1 extends Thread 
{
  @Override
public void run() {
  Class1.m1();
}
}
