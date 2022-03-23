package Shop;

public class Shop 
{
  int pen=2;
  public synchronized void consumer() 
  {
	if(pen==0)
	{
		try {wait();} catch (Exception e) {}
	}
	pen--;
	System.out.println(pen);
	if(pen<10)
	notify();
  }
  
  public synchronized void producer() 
  {
	if(pen>=100)
	{
		try {wait();} catch (Exception e) {}
	}
	pen++;
	System.out.println(pen);
	if(pen>10)
		notify();
}
}
