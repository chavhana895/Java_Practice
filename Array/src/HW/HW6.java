package HW;

public class HW6 {

	public static void main(String[] args)
	{
	  int [] a = {23,12,18,29,32};
	  
	  int i=0;
	  int j=a.length-1;
	  int m,n;
	  while(i<j)
	  {
		  a[i]=a[i]+a[j];
		  a[j]=a[i]-a[j];
		  a[i]=a[i]-a[j];
		  i++;j--;
		  
	  }
	  for (int k = 0; k < a.length; k++)
	  {
		System.out.println(a[k]);
	  }
	}

}
