package Exception_Practice;

public class prg5 {

	public static void main(String[] args) {
		int a[]= {1,2,34,5,6,7,8};
		try
		{
			System.out.println(a[10]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println(e);
		}

	}

}
