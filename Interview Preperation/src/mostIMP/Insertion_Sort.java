package mostIMP;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) 
	{
	  int a[] = {7,6,5,4,9,10,3};
	  for (int i = 0; i < a.length; i++) 
	  {
		int temp=a[i];
		int j=i; 
		while(j>0 && a[j-1]>temp)
		{
			a[j]=a[j-1];
			j=j-1;
		}
		a[j]=temp;
	  }
	  System.out.println(Arrays.toString(a));
	}

}
