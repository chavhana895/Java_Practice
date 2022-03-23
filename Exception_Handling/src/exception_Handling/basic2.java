package exception_Handling;

public class basic2 {

	public static void main(String[] args) 
	{
	   try {
		     System.out.println("something imp 1");
		     System.out.println("something imp 2");
		     System.out.println("something imp 3");
		     System.out.println("something imp 4");
		     System.out.println(11/0);
		     System.out.println("something imp 5");
		     System.out.println("something imp 6");
		     System.out.println("something imp 7");
		     System.out.println("something imp 8");
		     System.out.println("something imp 9");
		     
	       }
	   catch (Exception e) 
	   {
		System.out.println("hi");
	   }
	}

}
