package ProducerConsumer;

public class producer extends Thread
{
	Shop shop;

	public producer(Shop shop) {
		super();
		this.shop = shop;
	}
	@Override
	public void run() 
	{
		while(true)
		{
	    	shop.producer();
			try {
				Thread.sleep(100);
				} 
		catch (Exception e) {}
		}
	}
}
