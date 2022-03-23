package Shop5;

public class Shop 
{
  int pen=2;
   public synchronized void consume() 
   {
	 if(pen==0)
	 {
		 try {wait();} catch (Exception e) {}
	 }
	 pen--;
	 System.out.println(pen);
	 if(pen<10);
	 notify();
   }
   
   public synchronized void produce() 
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
