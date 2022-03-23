package Q4;

public class PropagatedException {

	public static void main(String[] args) throws Exception 
	{
	   System.out.println("I am in main Method");
	   m1();
	   System.out.println(" out main method");
	}

	private static void m1() throws Exception
	{
		System.out.println("In m1 Method");
		m2();
		System.out.println("Out m1 Method");
	}

	private static void m2() throws Exception
	{
	  System.out.println("In m2 Method");
	   System.out.println(45/0);
	  System.out.println("Out m2 Method");
	}

}
