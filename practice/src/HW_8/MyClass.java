package HW_8;

public class MyClass {

	public static void main(String[] args) 
	{
		Demo demo=new Demo();
		int result=0;
		try {
			result=demo.division(100,0);
			} 
		catch (Exception e) {
			System.out.println("Exception is Thrown");
			System.out.println(e.getCause());
		
		}
		finally {
		System.out.println(result);
		
		}
	}
}
