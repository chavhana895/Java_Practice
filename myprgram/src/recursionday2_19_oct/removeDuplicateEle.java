package recursionday2_19_oct;

import java.util.Arrays;

public class removeDuplicateEle {
	static int a[]= {1,2,3,42,1,1,2,1};
	static int spacecount=0; 
	static int index=0;
	public static void main(String[] args)
	{
		countRemoveElement(0,0);
		int newArray[]=new int[spacecount];
		System.out.println(Arrays.toString(newArray));
		RmoveElement(newArray,0,0,0);
		System.out.println(Arrays.toString(newArray));

	}
	private static void RmoveElement(int[] newArray, int i, int j,int count) 
	{
		if(i<a.length)
		{
			if(j<newArray.length-1)
			{
				
				if(newArray[j]==a[i])
				{
					count++;
				}
				
			}
			if(count==0)
			{
				newArray[index++]=a[i];
			}
			j++;
		
			if(j==a.length-1)
			{
				count=0;	i++;	j=0;
			}
			RmoveElement(newArray, i, j,count);
			}
		}
	
	private static void countRemoveElement(int i, int j) 
	{
		if(i<a.length-1)
		{
			if (j<a.length-1)
			{
				if(a[i]==a[j])
				{
					spacecount++;
				}
			}
			j++;
			if(j==a.length)
			{
				i++;
				j=i+1;
			}
			countRemoveElement(i, j);
		}
		
	}

}
