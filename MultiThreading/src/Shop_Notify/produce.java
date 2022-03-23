package Shop_Notify;

public class produce extends Thread {
Shop shop;

public produce(Shop shop) {
	
	this.shop = shop;
}
@Override
	public void run() {
		while(true)
		{
			shop.produce();
			try {Thread.sleep(1);} catch (Exception e) {}
		}
	}
}
