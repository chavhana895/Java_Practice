package PAGE1;

public class Q8 {

	public static void main(String[] args) throws Exception 
	{
		System.out.println("in main");
		M1();
		System.out.println("out main");

	}

	private static void M1() throws Exception 
	{
		System.out.println("I am in m1");
		m2();
		System.out.println("Out m1");
		
	}

	private static void m2() throws Exception 
	{
		System.out.println("IN M2");
		Thread.sleep(1000);
		System.out.println("Out m2");
		
	}

}
