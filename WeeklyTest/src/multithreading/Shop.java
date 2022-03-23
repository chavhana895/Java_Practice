package multithreading;

public class Shop
{
 int pens=2;
 
 public synchronized void consume() 
 {
	if(pens<10)
	{
	  try {wait();} catch (Exception e) {}
	}
	pens--;
	System.out.println(pens);
	if(pens<10)
		notify();
}
 
 public synchronized void produce()
 {
	 if(pens>=100)
	 {
		 try {wait();} catch (Exception e) {}
	 }
	 pens++;
	 System.out.println(pens);
	 if(pens>10)
		 notify();
 }
}
