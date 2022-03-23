package Shop5;

public class Producer extends Thread 
{
  Shop shop;

public Producer(Shop shop) {

	this.shop = shop;
}
  @Override
	public void run() {
		while(true)
		{
			shop.produce();
			try {Thread.sleep(10);} catch (Exception e) {}
		}
	}
}
