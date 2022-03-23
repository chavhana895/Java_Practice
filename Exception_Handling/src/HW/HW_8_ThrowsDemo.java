package HW;

public class HW_8_ThrowsDemo 
{

	public static void main(String[] args) 
	{
	  Demo demo=new Demo();
	  int result=0;
	  try 
	  {
		  result=demo.division(10,0);
	  }
	  catch (Exception e) 
	  {
		System.out.println(e.getMessage());
		System.out.println("Exception is thrown");
	  }
	  finally
	  {
	    System.out.println(result);
	  }
	}

}
