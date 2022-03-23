package mostIMP;

public class palindromeNo {

	public static void main(String[] args) 
	{
        int num=1234321;	
		int num1=num;
		int num2=0;
		
		while(num1>0)
		{
			int lastDigit=num1%10;
			num2=num2*10 + lastDigit;
			num1=num1/10;
		}
      if (num==num2)
	    System.out.println("Pandrome");
      else
      	System.out.println("not");
	}
}