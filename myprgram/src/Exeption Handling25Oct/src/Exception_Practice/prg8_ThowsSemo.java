package Exception_Practice;
// propagation manje method var method
public class prg8_ThowsSemo {

	public static void main(String[] args) {
		Demo demo=new Demo();
		int result=0;
		try
		{
			result=demo.division(10,2);
		}
		catch (Exception e)
		{
			System.out.println(e.getMessage());	
		}
		finally 
		{
			System.out.println("result :-"+result);
		}

	}

}
class Demo
{

	public int division(int dividend, int Divisor) throws Exception 
	{
		if(Divisor==0)
		{
			throw new Exception("Divisor cannot bezero");
		}
		else
		{
			return dividend/Divisor;
		}
				
	}
	
}
