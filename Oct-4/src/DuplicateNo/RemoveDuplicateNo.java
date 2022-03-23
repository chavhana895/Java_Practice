package DuplicateNo;

public class RemoveDuplicateNo 
{

	public static void main(String[] args) 
	{
		int []a= {1,3,6,3,7,8,3,3,3,9,4,2};
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
		int[]b=new int[a.length-count];
		int k=0;
		for (int i = 0; i < a.length; i++) 
		{
			int countInB=0;
			for (int j = 0; j < b.length; j++)
				{
				if(b[j]==a[i])
					
					countInB++;
				}
				if(countInB==0)
				{
					b[k++]=a[i];
				}
		}
			for (int i = 0; i < b.length; i++) 
			{
				System.out.print(b[i]+" ");
			}
	}
	}
