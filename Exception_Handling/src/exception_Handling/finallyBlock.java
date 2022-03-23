package exception_Handling;

public class finallyBlock {

	public static void main(String[] args) 
	{
      try {
             System.out.println(20/0);   	  
          }
      catch (Exception e) 
      {
		System.out.println(20/0);
	  }
      finally 
      {
	    System.out.println("Diwali la Sutti ahe");	
    	}
	}

}
