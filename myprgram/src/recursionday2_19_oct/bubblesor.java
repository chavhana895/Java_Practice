package recursionday2_19_oct;

import java.util.Arrays;

public class bubblesor {

	public static void main(String[] args)
	{
	
		int a[]= {1,9,3,6,2,5};
		bubulesorting(a,0,0);
		System.out.println(Arrays.toString(a));

	} 
	private static void bubulesorting(int[] a, int i,int j)
	{
		if(i<a.length-2)
		{
			if(j<a.length)
			{
				if(a[j]>a[j+1])
				{
					int temp =a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
			j++;
			if(j==a.length-1)
			{
				j=0;
				++i;
			}
			bubulesorting(a, i, j);
		}
		
	}

}
