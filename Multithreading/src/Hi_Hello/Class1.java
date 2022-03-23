package Hi_Hello;

public class Class1 
{
  boolean status=true;
  
   public synchronized void Hi() 
 {
    if(status==false)
    {
    	try {wait();}catch (Exception e) {}
    }
    System.out.println("Hi");
   status=false;
 	   notify();
 }
 
 public synchronized void Hello() 
 {
     if(status==true)
   {
	   try {wait();} catch (Exception e) {}
   }

   System.out.println("Hello");
  status=true;
   notify();
 }
}