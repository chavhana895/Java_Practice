package Array_recursion;

public class minDistance {

	static int min=Integer.MAX_VALUE;
	static int m=3,n=9;
	public static void main(String[] args) 
	{
	   int []a= {2,3,3,4,3,5,6,-2,4,7,4,2,9};
	   int i=0;
	   loopI(a,i);
	   System.out.println(min);
	}
	private static void loopI(int[] a, int i) 
	{
	  if(i<a.length)
	  {
		  if(a[i]==m)
		  {
			  int j=0;
			  loopj(a,i,j);
		  }
		  loopI(a, i+1);
	  }
	}
	private static void loopj(int[] a, int i, int j) 
	{
	  if(j<a.length)
	  {
		  if(a[j]==n)
		  {
			  if(i>j)
			  {
				  if(i-j<min)
			      min=i-j;
			  }
			  else
			      min=j-i;
		  }
		  loopj(a, i, j+1);
	  }
	}

}
