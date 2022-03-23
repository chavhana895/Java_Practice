package Nov23;

public class calc2 extends calc
{
	calc2() 
	{
		super();
		System.out.println("Hi from calc2");
	}
	public void mult(int a, int b)
	{
		System.out.println("Mult is: "+(a*b));
	}
	
	public void div(int a, int b)
	{
		System.out.println("Div is: "+(a/b));
	}
}
