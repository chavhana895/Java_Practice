package exception_Handling;

public class oneTryMultipleCatch {

	public static void main(String[] args) {
		int []a= {1,2,3};
		String s="hefshine";
		try
		{
			System.out.println(s.charAt(100));
			System.out.println(a[10]);
			System.out.println(10/0);
		}
		catch (ArrayIndexOutOfBoundsException aiob) 
		{
		   System.out.println("Array related issue");
		}
		catch (StringIndexOutOfBoundsException siob) 
		{
			System.out.println("String related issue");
		}
		catch (ArithmeticException ae) 
		{
			System.out.println("Arithmetic related issue");
		}
		catch (Exception e) 
		{
			System.out.println("issue");
		}
	}

}
