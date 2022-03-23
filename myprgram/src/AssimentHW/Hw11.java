package AssimentHW;

import java.util.Arrays;

/*  Write a program to remove the duplicate elements of a given array and return the new length of the array.
(Variations) */
public class Hw11 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,1,2,3,2};
		int count=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			if(a[i]==a[j])
			{
				count++;
				break;
			}
		}
	//	System.out.println(count);
		int b[]=new int[a.length-count];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
				count=0;
				for (int j = 0; j < b.length; j++)
				{
					if(b[j]==a[i])
					{
						count++;
						break;
					}
				}
				if(count==0)
					b[k++]=a[i];
		}
		System.out.println(Arrays.toString(b));
	}

}
