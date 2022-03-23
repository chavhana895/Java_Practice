
public class palindrome {

	public static void main(String[] args) 
	{
		int num=123454321;
		int num1=num;
		int sum=0;
		
		while(num1>0)
		{
			int lastDigit=num1%10;
			sum=sum*10+lastDigit;
		num1=num1/10;
		}
		if(num==sum)
			System.out.println("palindrome");
		else
			System.out.println("Not");
	}

}
