package Shop_Problem;

public class Shop 
{
 int pens=2;
 public synchronized void consumer() 
 {
   if(pens==0)
   {
	   try {wait();} catch (Exception e) {}
   }
   pens--;
   System.out.println(pens);
   if(pens<10)
	   notify(); 
 }
 
 public synchronized void producer() 
 {
    if(pens>=100)
    {
    	try {wait();}catch (Exception e) {}
    }
    pens++;
    System.out.println(pens);
    if(pens>10)
    	notify();
 }
}
