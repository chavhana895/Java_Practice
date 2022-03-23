package Recursion;

public class SortingElement {

	public static void main(String[] args) 
		{
		  int []a= {1,4,8,3,5,2,9};
		  int i=0;
		  sortI(a,i);
          int k=0;
          print(a,k);
		}

	private static void print(int[] a, int k) {
		// TODO Auto-generated method stub
		
	}

	private static void sortI(int[] a, int i) 
	{
		if(i<a.length)
		{
			int j=i+1;
			sortJ(a,i,j);
			sortI(a,i+1);
		}
	}

	private static void sortJ(int[] a, int i, int j)
	{
	  if(j<a.length)
	  {
		  if(a[i]>a[j])
		  {
			  int temp=a[i];
			  a[i]=a[j];
			  a[j]=temp;	
		  }
		  sortJ(a, i, j+1);
	  }

	}

}
