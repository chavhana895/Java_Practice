package producerConsumer2;

public class Producer {
int pens=0;
public synchronized void producer()
{
	if(pens>=50)
	{
		try {wait();} 
		catch (Exception e) {}
	}
	pens++;
	System.out.println("P  "+pens);
	if(pens>=5)
		notify();
}
public synchronized void Consumer()
{
	if(pens<=0)
	{
		try {wait();} catch (Exception e) {}
	}
	pens--;
	System.out.println("Consumer "+pens);
	if(pens<=10)
		notify();
}
}
