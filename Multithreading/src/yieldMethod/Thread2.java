package yieldMethod;

public class Thread2 extends Thread 
{
  @Override
public void run() {
for (int i = 0; i < 1000; i++) {
	Thread.yield();
	System.out.println("Girls");
}
}
}
