package feb_18;

public class Shop
{
   static int pen=0;
  public void produce() throws Exception
   { 
	  if(pen>20)
	  {
		  wait();
	  }
	  pen=pen+1;
	   System.out.println("Produce Pen "+pen);
	   
	   if(pen>=10)
	   {
		   notify();
	   }
   }
   
  public  void consume() throws Exception
   {
	  if(pen<10)
	  {
		  wait();
	  }
	  pen--;
	   System.out.println("Consume pen "+pen);
	   
	   if(pen<=10)
	   {
		   notify();
	   }
   }
}
