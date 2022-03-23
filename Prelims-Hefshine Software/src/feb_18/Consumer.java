package feb_18;

public class Consumer extends Thread 
{
   Shop shop;
public void run(Shop shop) throws Exception 
   {
	   for (int i = 0; i < 50; i++) 
	   {
		  shop.consume();
	   }
	 
   }
}
