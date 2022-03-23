package Shop1;
public class Consumer extends Thread {
Shop shop;

public Consumer(Shop shop) {
	super();
	this.shop = shop;
}

	public void run() {
		while(true)
		{
			shop.consume();
			try {Thread.sleep(1000);} catch (Exception e) {}
		}
	}
}