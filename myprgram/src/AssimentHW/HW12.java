package AssimentHW;

import java.util.Arrays;

/* Write a program to put even and odd elements of array in two separate arrays. (Variations) */
public class HW12 {

	public static void main(String[] args) 
	{
		int count=0,Cnt=0;
		int a[]= {1,2,3,4,5,6,7,8,9};
		for (int i = 0; i < a.length; i++)
		{
			
			if(a[i]%2==0)
			{
				count++;
				//System.out.println(a[i]);
			}
			else
				Cnt++;
		}
		int Even[]=new int[a.length-Cnt];
		int Odd[]=new int[a.length-count];
		Cnt=0;
		count=0;
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]%2!=0)
				Odd[Cnt++]=a[i];
			else
				Even[count++]=a[i];

		
		}
		System.out.println(Arrays.toString(Odd));
		System.out.println(Arrays.toString(Even));
	}

}
