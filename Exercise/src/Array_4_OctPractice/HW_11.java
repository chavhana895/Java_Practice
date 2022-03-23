package Array_4_OctPractice;

import java.util.Iterator;

public class HW_11 {

	public static void main(String[] args) {
		int []a= {1,2,3,3,4,6,7,3,4,1,9,13,7};
int count=0;
for (int i = 0; i < a.length; i++) 
{ 
	for (int j =i+1; j < a.length; j++) 
	{
		if(a[i]==a[j])
		{
			count++;
			break;
		}		
	}
}
int []b=new int[a.length-count];
int k=0;
for (int i = 0; i < a.length; i++) 
{
	int num=a[i];
	int countInB=0;
	for (int j = 0; j < b.length; j++) 
	{
		if (b[j]==num)
		
			countInB++;
		}
		if(countInB==0)
		{
			b[k]=num;
			k++;			
		}
	}
	for (int i = 0; i < b.length; i++) 
	{
		System.out.println(b[i]);
	}
}
	}


