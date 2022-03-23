package mostIMP;

public class factorial {

	public static void main(String[] args)
	{
     int num=10;
     int fact=1;
	 int result=	LoopI(num,fact,2);
	 System.out.println(result);
	}

	private static int LoopI(int num, int fact, int i) 
	{
	  if(i<=num)
	  {
		 fact=fact*i;
		return LoopI(num, fact, i+1);
	  }
	  return fact;
	}
}
