package Exception_Practice;

public class prg4 {

	public static void main(String[] args) {
		try
		{
			System.out.println(3/0);
		}
		catch (Exception e) {}
		System.out.println("Emty catch");
	}

}
