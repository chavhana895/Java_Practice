package Exception_Practice;

public class prg7 {

	public static void main(String[] args)  throws Exception
	{
			System.out.println("in main");
			M1();
			System.out.println("out main");
		
	}

	private static void M1() throws Exception
	{
		
		System.out.println("M1 in");
		m2();
		System.out.println("out m2");
		
	}

	private static void m2() throws Exception {
		System.out.println("in m2");
		Thread.sleep(9000);
		System.out.println("out m2");
		
	}

}
