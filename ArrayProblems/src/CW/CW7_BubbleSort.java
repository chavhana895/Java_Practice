package CW;

public class CW7_BubbleSort 
{

	public static void main(String[] args) 
  {   	
		int []a= {3,60,35,2,45,320,5};
		
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
	  for (int i = 0; i < a.length; i++) 
	  {
		System.out.print(a[i]+" ");
	  }
  }
}
