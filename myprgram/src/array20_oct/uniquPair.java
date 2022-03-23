package array20_oct;

import java.util.Arrays;
public class uniquPair {
	static int  count=0;
	public static void main(String[] args) {
		int a[]= {2, 4, 3, 5, 6, -2, 4, 7, 8, 9};
		RemoveDublicate(a,0,1);
		//System.out.println(count);
		int aa[]=new int[a.length-count];
		count=0;
		AddArrayElement(aa,0,0,a,0,0);
		System.out.println(Arrays.toString(aa));
		uniquPair1(a,0,1);

	}

	private static void AddArrayElement(int[] aa, int i, int j, int[] a, int k, int l)
	{
		if(i<a.length)
		{
			if(j<aa.length-1)
			{
				if(aa[j]==a[i])
				{
						count++;
				}
			}
			if(count==0)
			{
				aa[k++]=a[i];
				j=0;
				i++;
			}
			if(j<aa.length-1)
			{
				j++;
				
			}
			else
			{
				i++;
				count=0;
				j=0;
			}
			
			AddArrayElement(aa, i, j, a, k, l);
			
		}
	}
	private static void uniquPair1(int[] a, int i, int j) 
	{
		if(i<a.length && j<a.length)
		{
			if(a[i]+a[j]==7)
			{
				System.out.println(a[i]+" "+a[j]);
			}
			if(j<a.length-1)
			{
				j++;
			}
			else
			{
				i++;
				j=i+1;
			}
			uniquPair1(a, i, j);
		}
	}
	private static void RemoveDublicate(int[] a, int i, int j) 
	{
		if(i<a.length)
		{
			if(j<a.length)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(j<a.length-1)
			{
				j++;
			}
			else
			{
				i++;
				j=i+1;
			}
			RemoveDublicate(a, i, j);
		}
	}

}
