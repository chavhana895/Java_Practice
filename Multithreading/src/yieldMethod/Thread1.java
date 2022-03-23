package yieldMethod;

public class Thread1 extends Thread 
{
@Override
public void run() {
for (int i = 0; i < 1000; i++) 
{
	//Thread.yield();
	System.out.println("Boys");
}
}
}
