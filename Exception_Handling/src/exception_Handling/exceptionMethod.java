package exception_Handling;

public class exceptionMethod {

	public static void main(String[] args) 
	{
	 /* System.out.println("In Main");
	  try
	  {
		  m1();
	  }
	  catch (Exception e) 
	  {
		System.out.println("hi");
	  }
	  System.out.println("out main");
	}

	private static void m1() 
	{
	   System.out.println("in m1");
	   m2();
	   System.out.println("out m1");
	}

	private static void m2() 
	{
	   System.out.println("in m2");
	   System.out.println(10/0);
	 */
		
		
		
		
/*	
		System.out.println("In Main");
		  {
			  m1();
		
			System.out.println("hi");
		  }
		  System.out.println("out main");
		}

		private static void m1() 
		{
		   System.out.println("in m1");
		   try 
		   {
		   m2();
		  
		   }
		   System.out.println("out m1");
		   catch (Exception e) 
		   {
			System.out.println("hi");
	     	}
		   System.out.println("out m1");
		}

		private static void m2() 
		{
		   System.out.println("in m2");
		   System.out.println(10/0);
		   
		   
		   */
		
		
		
		System.out.println("in main");
		m1();
		System.out.println("out main");
	}

	private static void m1() 
	{
	   System.out.println("in m1");
	   m2();
	   System.out.println("out m1");
	}

	private static void m2() 
	{
	  System.out.println("in m2");
	  try {
		  System.out.println(20/0);
	  }
	  catch (Exception e) 
	  {
	    System.out.println("in catch of catch");
	}
	  System.out.println("out m2");
	}

}
