package Recursion;

public class MaxValue {

	public static void main(String[] args) 
	{
		int []a= {3,5,11,7,9};
		int i=0;
		int max=Integer.MIN_VALUE;
		printMax(a,i,max);
	}

	private static void printMax(int[] a, int i, int max) 
	{
		if(i<a.length)
		{
			if(a[i]>max)
				max=a[i];
			printMax(a, i+1, max);
		}
		else
			System.out.println(max);
	}

}
