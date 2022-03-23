package array;

public class uniquePair {

	public static void main(String[] args) 
	{
		int []a= {2,3,5,6,9,-2,4,11};
		int i=0,j=0;
		checkPair(a,i,j);
	}

	private static void checkPair(int[] a, int i, int j) 
	{
	  if(i<a.length && j<a.length)
	  {
		  if(a[i]+a[j]==7)
			  System.out.println(a[i]+" "+a[j]);
		  if(j<a.length-1)
			  j++;
		  
		  else
		  {
			  i++;j=i+1;
		  }
		  checkPair(a, i, j);
	  }
	}

}
