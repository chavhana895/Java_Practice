package multithreading;

public class Producer extends Thread 
{
  Shop shop;
  
	
	public Producer(Shop shop) {
	super();
	this.shop = shop;
}


	public void run() 
	{
	  while(true)
	  {
		  shop.produce();
		  try {Thread.sleep(10);} catch (Exception e) {}
	  }
	}
}
