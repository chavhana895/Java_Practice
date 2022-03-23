package exception_Handling;

public class throwException {

	/*public static void main(String[] args) 
	{
	  System.out.println("hi");   //check exception
	  try
	  {
		  Thread.sleep(100);
	  }
	  catch (Exception e) 
	  {
		
	  }
	  System.out.println("hello");
	}*/

	
	
public static void main(String[] args) throws Exception
{
	System.out.println("hi");      //uncheck exception
	Thread.sleep(100);
	System.out.println("hello");
}
}
