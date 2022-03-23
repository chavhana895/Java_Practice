package ProducerConsumer;

public class Shop {
int pen=0;
public synchronized void producer()
{
	
	if(pen>=50)
	{
		try {
			wait();
		    } catch (Exception e) {}
		
	}
	pen++;
	System.out.println("Pro "+pen);
	if(pen>=5)
	{
		notify();
	}
}
public void consumer()
{
	if(pen<=0)
	{
		try {wait();}
		catch (Exception e) {}
	}
}
}
