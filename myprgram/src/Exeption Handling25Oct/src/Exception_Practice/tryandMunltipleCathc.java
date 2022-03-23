package Exception_Practice;

public class tryandMunltipleCathc {

	public static void main(String[] args) {
		int a[]= {1,2,3};
		String s="hefshine";
		try
		{
			//System.out.println(s.charAt(100));
		//	System.out.println(a[10]);
		//	System.out.println(10/0);
			Thread.sleep(10000);
			System.out.println("ijlka");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Array Related issue");
		}
		catch(StringIndexOutOfBoundsException e)
		{
			System.out.println("String relate issue");
		}
	//	catch (ArithmeticException e) 
//		{
//			System.out.println("Arithmatic exception");
//		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
