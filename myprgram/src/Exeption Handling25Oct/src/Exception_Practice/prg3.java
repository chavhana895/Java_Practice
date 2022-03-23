package Exception_Practice;

public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,45,5};
		try
		{
			System.out.println(10/0);
			try
			{
				
			
			System.out.println(a[9]);
			}
			catch (Exception e)
			{
				// TODO: handle exception
				System.out.println(e);
			}
			
		}
		catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e);
			try
			{
				
			
			System.out.println(a[9]);
			}
			catch (Exception ee)
			{
				// TODO: handle exception
				System.out.println(ee);
			}
		}
		
	}

}
