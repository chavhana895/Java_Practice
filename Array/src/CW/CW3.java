package CW;

public class CW3 
{

	public static void main(String[] args) 
	{                                            //Selection Sort
	  int [] a = {12,1,4,2,25,23,78,17};
	  for (int i = 0; i < a.length; i++)
	  {
		for (int j = i+1; j < a.length; j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	  }
	  for (int j = 0; j < a.length; j++)
		{
			System.out.println(a[j]);
		}
	}

}
