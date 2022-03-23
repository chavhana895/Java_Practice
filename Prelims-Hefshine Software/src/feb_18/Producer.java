package feb_18;

public class Producer extends Thread
{
 Shop shop;
public void run(Shop sp) throws Exception 
  {
	 for (int i = 0; i < 50; i++) 
	 {
		shop.produce();
	}
  }
}
