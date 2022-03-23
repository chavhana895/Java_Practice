package Exception_Practice;

public class demo1 {

	public static void main(String[] args)
	{
		try
		{
			System.out.println(10/1);
		}
		catch (Exception e)
		{
			System.out.println("hello");
		}
	//	System.out.println("something Important");
		finally 
		{
			System.out.println("finally");
		}
	}

}
