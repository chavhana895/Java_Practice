package Basic;

public class sameOrNotLocalVeriable {

	public static void main(String[] args) 
	{
      int i=0;
      int [] a = {1,2,3};
      int [] b = {1,2,7};
      
      int diffcount=0;
      
      if(a.length==b.length)
      {
    	diffcount=check(i,a,b,diffcount);
    	if(diffcount==0)
    		System.out.println("Same");
    	else
    		System.out.println("Diff");
    	
      }
      else
    	  System.out.println("Not Same");
	}

	private static int check(int i, int[] a, int[] b, int diffcount) 
	{
		if(i<a.length)
		{
		   if(a[i]!=b[i])
		   {
			   diffcount++;
			   return diffcount;
		   }
		   int updatedDiffCount= check(i+1, a, b, diffcount);
		   return updatedDiffCount;
		}
		else
		return diffcount;
	}

}
