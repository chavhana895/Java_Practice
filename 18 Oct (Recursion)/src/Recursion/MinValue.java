package Recursion;

public class MinValue 
{

	public static void main(String[] args) 
	{
		
		int []a= {32,2,54,1,6,76,8};
		int i=0;
		int min=Integer.MAX_VALUE;
		printMinValue(a,i,min);

	}

	private static void printMinValue(int[] a, int i, int min) 
	{
		if(i<a.length)
		 {
			if(a[i]<min)
			min=a[i];
			printMinValue(a, i+1, min);
		 }
			else
			{
				System.out.println(min);
			}
		}
		
	}

