package mostIMP;

public class factorialRecursion {

	public static void main(String[] args) 
	{
	  int num=5;
	  int  ans= factorialCalc(num);
	  System.out.println(ans);
	}

	private static int factorialCalc(int num) 
	{
	  if(num==0 || num==1)
	  {
		  return 1;
	  }
	  
	  int num1=factorialCalc(num-1);
	  int fact =num1*num;
	  return fact;
	}

}
