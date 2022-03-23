package Q4;

public class checkedExceoption {

	public static void main(String[] args)
	{
		System.out.println(23/0);
		throw new ArithmeticException("Error in Expression");
	}

}
