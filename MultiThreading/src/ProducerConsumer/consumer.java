package ProducerConsumer;

public class consumer extends Thread {
Shop shop;

public consumer(Shop shop) {
	
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
