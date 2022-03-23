package Practice;

public class exception_Propagation {

	public static void main(String[] args) 
	{
	  System.out.println("In Main");
	  m1();
	  System.out.println("Out Main");
	}

	private static void m1() 
	{
	  System.out.println("In M1");
	  m2();
	  System.out.println("Out M1");
	}

	private static void m2() 
	{
	  System.out.println("In M2");
	 try {System.out.println(5/0);
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	  System.out.println("Out M2");
	}

}
