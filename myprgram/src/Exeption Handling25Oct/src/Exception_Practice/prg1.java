package Exception_Practice;

public class prg1 {

	public static void main(String[] args) {
		try
		{
			System.out.println(10/0);
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
