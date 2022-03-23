package synchronized_Method;

public class Thread2 extends Thread 
{
  @Override
public void run() 
  {
	for (int i = 0; i < 100000; i++) 
	{
	  Addition.add();	
	}
}
}
