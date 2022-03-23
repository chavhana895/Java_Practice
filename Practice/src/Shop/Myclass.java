package Shop;

public class Myclass {

	public static void main(String[] args) 
	{
	  Shop shop = new Shop();
	  Consumer c = new Consumer(shop);
	  Producer p = new Producer(shop);
	  c.start();
	  p.start();
	}

}
