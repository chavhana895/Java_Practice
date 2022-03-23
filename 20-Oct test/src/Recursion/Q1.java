package Recursion;

public class Q1 {

	static int Average=0;
	public static void main(String[] args) 
	{
	   int []a= {1,2,3,4,5};
	   int sum=0;
	   int i=0;
	   loopI(a,sum,i);

	}

	private static void loopI(int[] a, int sum, int i) 
	{
	   if(i<a.length)
	   {  
	 
		   sum=sum+a[i];
		   Average=sum/a.length;
		   loopI(a, sum, i+1);
	   }
	   else
		   System.out.println("Average is: "+Average);
	}
	
}
