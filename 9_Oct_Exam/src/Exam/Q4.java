package Exam;

public class Q4 
{

	public static void main(String[] args) 
	{
		int []a= {1,2,3,4,5,6,7,8,9};
		int temp=0;
		
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = 0; j < a.length; j++) 
			{
				if(a[j]%2!=0 && a[i]%2==0)
				{
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				}
			}		
		}
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
	}

}
