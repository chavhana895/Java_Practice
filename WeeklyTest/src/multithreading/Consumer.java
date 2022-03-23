package multithreading;

public class Consumer extends Thread 
{
  Shop shop;

public Consumer(Shop shop) {
	super();
	this.shop = shop;
}
  
  @Override
	public void run() {
	shop.consume();
	try {Thread.sleep(100);} catch (Exception e) {}
	}
}
