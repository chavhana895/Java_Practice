package Exception_Practice;

public class prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			System.out.println(10/0);
		}
		catch (Exception e) {
			
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally Block");
		}
	}

}
