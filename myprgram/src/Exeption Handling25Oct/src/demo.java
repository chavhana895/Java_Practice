
public class demo {

	public static void main(String[] args) 
	{
		System.out.println("word");
		try
		{
			System.out.println(10/0);
		}
		catch (Exception e) {
		System.out.println(e);
		}
		System.out.println("hello");
	}

}
