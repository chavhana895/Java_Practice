package Collebera;

public class palindrome {

	public static void main(String[] args)
	{
		int num=1235321;
		int num1=num;
		int add=0;
		
		while(num1>0)
		{
			int lastDigit=num1%10;
			add=add*10+lastDigit;
			num1=num1/10;
		}
		if(num==add)
			System.out.println("Pandrome");
		else
			System.out.println("Not Palindrome");
	}

}
