package Shop_Notify;

public class Shop {
int pens=0;
public void produce()   //synchronized 
{
	if(pens>=50)
	{
		try {wait();} 
		catch (Exception e) {}
	}
	pens++;
	System.out.println("Pro "+pens);
	if(pens>=5)
	{
		notify();
	}
}
public void consume() 
{
	if(pens<=0)
	{
		try {wait();} catch (Exception e) {}
	}
	pens--;
	System.out.println("consume "+pens);
	if(pens<=10)
	{
		notify(); 
	}
}
}
