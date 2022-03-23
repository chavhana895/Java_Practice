
public class demo2 {

	public static void main(String[] args) {
		try
		{
			System.out.println("somthing imp 1");
			System.out.println("somthing imp 2");
			System.out.println("somthing imp 3");
			System.out.println("somthing imp 4");
			try
			{
				System.out.println(12/0);
			}
			catch (Exception e)
			{
				try 
				{
					System.out.println(13/0);
				}
				catch (Exception e1)
				{
					System.out.println( "Life is end ");
				}
				e.printStackTrace();
			}
			try
			{
				System.out.println(11/0);
			}
			catch (Exception e) 
			{
				System.out.println("find error");
			}
			System.out.println("somthing imp 5");
			System.out.println("somthing imp 6");
			System.out.println("somthing imp 7");
			System.out.println("somthing imp 8");
		}
		catch (Exception e)
		{
			System.out.println("Error ");
		}
		

	}

}
