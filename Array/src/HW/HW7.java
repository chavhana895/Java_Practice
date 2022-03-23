package HW;

public class HW7 {

	public static void main(String[] args)
	{
	  int [] a = {23,52,12,14,51,19};
	  for (int i = 0; i < a.length; i++)
	  {
		for (int j = 0; j < a.length; j++)
		{
			if(a[i]<a[j])
			{                                        //Bubble sort
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	  }
	  for (int i = 0; i < a.length; i++)
	  {
		System.out.println(a[i]+" ");
	  }
	}

}
