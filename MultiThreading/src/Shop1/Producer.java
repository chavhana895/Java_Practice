package Shop1;

public class Producer extends Thread {
Shop shop;

public Producer(Shop shop) {
	this.shop=shop;
}

@Override
	public void run() {
		while(true)
		{
			shop.Produce();
	try {Thread.sleep(10);} catch (Exception e) {}
		}
	}
}
