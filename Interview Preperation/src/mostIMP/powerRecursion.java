package mostIMP;

public class powerRecursion 
{
	public static void main(String[] args) 
	{
	  int x=2, n=5;
	  int ans= calcPower(x,n);
	  System.out.println(ans);
	  
//	  int a=(int) Math.pow(2, 5);    //ans check condition
//	  System.out.println(a);
	}

	private static int calcPower(int x, int n) 
	{
		if(x==0)
		{
			return 0;
		}
		if(n==0)
		{
			return 1;
		}
		int xPow=calcPower(x, n-1);
		int pow=x*xPow;
		return pow;
	}
}