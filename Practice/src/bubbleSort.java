
public class bubbleSort {

	public static void main(String[] args) 
	{
	  int [] a= {12,6,7,3,9,5};
	  
	  for (int i = 0; i < a.length; i++) 
	  {
		for (int j = 0; j < a.length; j++) 
		{
			if(a[i]<a[j])
			{
				int temp= a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	  }
	  for (int i = 0; i < a.length; i++) 
	  {
		System.out.print(a[i]+" ");
	}
	}

}
