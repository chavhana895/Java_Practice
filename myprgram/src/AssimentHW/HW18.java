package AssimentHW;
/* Write a program to separate even and odd numbers of an given array of integers. Put all even numbers first, and 
then oddnumbers. (Variations) */
public class HW18 {

	public static void main(String[] args) 
	{
		int a[]= {1,2,4,5,7,8,9,9,6};
		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++)
			{
				if(a[i]%2!=0 && a[j]%2==0)
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}

		

	}

}
