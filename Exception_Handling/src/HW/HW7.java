package HW;

public class HW7 {

	public static void main(String[] args) throws Exception
	{
	 System.out.println("in main");
	 m1();
	 System.out.println("Out Main");
	}

	private static void m1() throws Exception
	{
	   System.out.println("in m1");
	   m2();
	   System.out.println("out m1");
	}

	private static void m2() throws Exception
	{
	  System.out.println("in m2");
	  Thread.sleep(1000);
	  System.out.println("out m2");
	}

}
