package Shop_Notify;

public class MyShop {

	public static void main(String[] args) throws InterruptedException {
	Shop shop=new Shop();
	produce p=new produce(shop);
	consume c=new consume(shop);
	
	p.start();
	c.start();
	
	}

}
