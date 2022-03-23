package exception_Handling;

public class nestedTryCatch {

	public static void main(String[] args) 
	{
	   try {
		      System.out.println("something imp 1");
		      System.out.println("something imp 2");
		      System.out.println("something imp2");
		      System.out.println("something imp3"); 
	       try {
			      System.out.println(11/0);
		       } 
	       catch (Exception e) 
	           {
			     System.out.println("Something wrong01");
		      }
	       System.out.println("Something imp 05");
	       System.out.println("Something imp 6");
	     }
	   catch (Exception e) 
	   {
		System.out.println("something wrong 02");
	   }
	}

}
