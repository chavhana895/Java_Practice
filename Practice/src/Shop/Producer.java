package Shop;

public class Producer extends Thread 
{
Shop shop;

public Producer(Shop shop) 
{
	this.shop = shop;
}
@Override
	public void run() {
		while(true)
		{
			shop.producer();
			try {Thread.sleep(10);} catch (Exception e) {}
		}
	}

}
