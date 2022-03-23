
public class demomethod {

	public static void main(String[] args) {
		System.out.println("In Main");
		try
		{
			m1();
		}
		catch (Exception  e) 
		{
			// TODO: handle exception 
			System.out.println("main Exption");
		}
		System.out.println("out main");

	}

	private static void m1() {
		System.out.println("in m1");
		try
		{
			m2();
			System.out.println(10/0);
		}
		catch (Exception e )
		{
			System.out.println("m1 Exeption");
		}
		System.out.println("out m1");
	}

	private static void m2()
	{
		System.out.println("in m2");
		try
		{
			System.out.println(10/0);
		}
		catch (Exception e)
		{
			System.out.println("m2 exception");
		}
		finally
		{
			System.out.println("out m2");
		}
		System.out.println("out finally");
		
	}
	

}
