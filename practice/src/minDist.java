
public class minDist {

	static int min=Integer.MAX_VALUE;
	static int m=2, n=7;
	public static void main(String[] args) 
	{
	  int []a= {1,2,3,4,5,6,7};
	 
	  int i=0,j=0;
	  loopI(a,j,i);
	  System.out.println(min);
	}

	private static void loopI(int[] a, int i, int j) 
	{
	  if(i<a.length)
	  {
		  if(a[i]==m)
		  {
			 j=0;
			 loopJ(a,i,j,min);
		  }
		  loopI(a, i+1, j);
	  }
	}

	private static void loopJ(int[] a, int i, int j, int min2) 
	{
	   if(j<a.length)
	   {
		   if(a[j]==n)
		   {
			   if(i<j)
			   {
				   if(i-j<min)
					   min=i-j;
			   }
			   else
				   min=j-i;
		   }
		   loopJ(a, i, j+1, min2);
	   }
	}

}
