package mostIMP;


public class maxArray 
{

	public static void main(String[] args) 
	{
      int []a= {23,12,16,35,24};
     
      int max=Integer.MIN_VALUE;
      int max1=Integer.MIN_VALUE;
      for (int i = 0; i < a.length; i++) 
      {
		if(max<a[i])
			max=a[i];
	  }
      for (int i = 0; i < a.length; i++) 
      {
		if(a[i]!=max)
		{
			if(a[i]>max1)
				max1=a[i];
		}
	  }
      System.out.println(max1);
	  }
}
