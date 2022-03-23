package Recursion;

public class soarting2 {

	public static void main(String[] args) 
	{
		int []a= {3,7,9,2,6,5,8};
		int i=0, j=i+1;
		sortMyArray(a,i,j);
		
		for (int j2 = 0; j2 < a.length; j2++) 
		{
			System.out.print(a[j2]+" ");
		}
	}

	private static void sortMyArray(int[] a, int i, int j) 
	{
	  if(i<a.length && j<a.length)
	  {
		  if(a[i]>a[j])
		  {
			  int temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;		  
		  }
		  if(j<a.length-1)
			  j++;
		  else
		  {
			  i++;
			  j=i+1;
		  }
		  sortMyArray(a, i, j);
	  }
	}

}
