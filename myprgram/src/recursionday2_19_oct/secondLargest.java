package recursionday2_19_oct;

public class secondLargest {

	public static void main(String[] args) 
	{
		int a[]= {1,2,9,3,5,7};
		int max=Integer.MIN_VALUE;
		max=secMax(a,max,0,0);
		System.out.println(max);
		int secmax=a[0];
		secmax=secondLargestNo(a,secmax,0,max);
		System.out.println("Second Largest Number is :-"+secmax);
	}

	private static int secondLargestNo(int[] a, int secmax, int i,int max)
	{
		if(i<a.length)
		{
			if(a[i]!=max)
			{
				if(a[i]<max)
				{
					secmax=a[i];
				}
			}
			return secondLargestNo(a, secmax, ++i,max);
		}
		
		return secmax;
	}

	private static int secMax(int[] a, int max, int i, int j) 
	{
		if(i<a.length)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			return secMax(a, max, ++i, j);
		}
		return max;
		
		
	}

}
