package Basic;

public class sameOrNot {

	static int i=0;
	static int []a= {1,2,3};
	static int []b = {1,2,3};
	static int diffcount=0;
	public static void main(String[] args) 
	{
      if(a.length==b.length)
      {
    	  check();
    	  if(diffcount==0)
    		  System.out.println("Same");
    	  else
    		  System.out.println("Not Same");
      }
      else
    	  System.out.println("Not Same");
	}
	private static void check() 
	{
		if(a[i]!=b[i])
		{
			diffcount++;
			i++;
			check();
		}
	}
}
