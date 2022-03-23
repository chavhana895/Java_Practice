package ProducerConsumer;

public class MyShop {

	public static void main(String[] args) {
		Shop shop=new Shop();
		producer p=new producer(shop);
		consumer consumer=new consumer(shop);
		p.start();
		consumer.start();
	}
}
