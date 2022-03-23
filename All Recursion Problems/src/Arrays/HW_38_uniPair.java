package Arrays;

public class HW_38_uniPair {

	public static void main(String[] args) 
	{
		int []a= {2,4,3,5,-2,4,7,8,9};
		int i=0, j=i+1;
		checkPairs(a,i,j);	
	}

	private static void checkPairs(int[] a, int i, int j) 
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
    	  checkPairs(a,i,j);
      }
	}

}
