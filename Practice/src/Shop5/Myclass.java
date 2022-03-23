package Shop5;

public class Myclass {

	public static void main(String[] args) 
	{
	  Shop shop = new Shop();
	  Producer p = new Producer(shop);
	  Consumer c = new Consumer(shop);
	  p.start();
	  c.start();
	}

}
