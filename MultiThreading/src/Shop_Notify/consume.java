package Shop_Notify;

public class consume extends Thread {
Shop shop;

public consume(Shop shop) {
	
	this.shop = shop;
}
public void run() {
	while(true)
	{
		shop.consume();
		//try {Thread.sleep(0);} catch (Exception e) {}
	}
}
}
