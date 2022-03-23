package Shop;

public class Consumer extends Thread 
{
  Shop shop;

public Consumer(Shop shop) 
{	
	this.shop = shop;
}
  @Override
	public void run() {
		while(true)
		{
			shop.consumer();
			try {Thread.sleep(100);} catch (Exception e) {}
		}
	}
}
