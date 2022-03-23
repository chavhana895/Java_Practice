package Array;

public class mindist {

	static int min=Integer.MAX_VALUE;
	static int m=3,n=5;
	public static void main(String[] args)
	{
		int []a= {1,3,12,4,7,4,5,1,34};
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
			int  j=0;
			  loopJ(a,i,j);  
		  }
		  loopI(a, i+1);
	  }
	}
	private static void loopJ(int[] a, int i, int j) 
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
			 {
		     min=j-i;
			 }
		  }
		  loopJ(a, i, j+1);
	  }
	}
}
