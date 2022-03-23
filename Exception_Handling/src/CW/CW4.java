package CW;

public class CW4 {

	public static void main(String[] args) 
	{
	  try
	  {
		  System.out.println(10/0);
	  }
	  catch (Exception e) 
	  {
		System.out.println(11/0);
	  }
	  finally
	  {
		  System.out.println("Diwali la Sutti Ahe");
	  }
	}

}
