package mostIMP;

public class fibonacci_Recursion {

	static int n=0,n1=1,n2=0;
	public static void main(String[] args) 
	{
		int cnt=10;
		System.out.print(n+" "+n1);
		printFibonacci(cnt-2);
	}
	private static void printFibonacci(int i) 
	{
		if(i>0)
		{
			n2=n+n1;
			n=n1;
			n1=n2;
			System.out.print(" "+n2);
			printFibonacci(i-1);
		}
	}
}
