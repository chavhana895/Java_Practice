package mostIMP;

public class fiboRecursion 
{
    public static void main(String[] args) 
	{
	  int a=0,b=1;
	  int n=10;
	  System.out.println(a);
	  System.out.println(b);
	  
	  printFib(a,b,n-2);
	}

	private static void printFib(int a, int b, int n) 
	{
	  if(n==0)
	  {
		  return;
	  }
	   int c=a+b;
	   System.out.println(c);
	   printFib(b, c, n-1);
	}

}