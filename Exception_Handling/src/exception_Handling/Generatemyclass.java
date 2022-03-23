package exception_Handling;

public class Generatemyclass {

	public static void main(String[] args) throws GenerateExeption1
	{
	int a=10; int b=101;
	if(b<1 || b>100)
	{
		throw new GenerateExeption1("less than 0 and greater than 100");
		
	}
	else
	{
		System.out.println(a/b);
	}
	}

}
