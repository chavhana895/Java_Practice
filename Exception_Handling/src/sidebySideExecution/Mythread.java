package sidebySideExecution;

public class Mythread extends Thread
{
  public void run() {
	  for (int i = 0; i < 100; i++) 
	  {
		System.out.println("hi");
		try {
			Thread.sleep(500);
		}
		catch (Exception e) {
		}
    	}
  }
}
