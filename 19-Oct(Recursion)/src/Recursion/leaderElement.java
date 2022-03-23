package Recursion;

public class leaderElement {

	public static void main(String[] args) 
	{
		int []a= {3,4,8,1,6,3,4};
		
		loopI(a,0);
	}

	private static void loopI(int[] a, int i) 
	{
	  if(i<a.length)
	  {
		  int j=i+1;
		  int count=0;
		  loopJ(a,i,j+1,count);
		  loopI(a, i+1);
	  }
	}

	private static void loopJ(int[] a, int i, int j, int count) 
	{
	  if(j<a.length)
	  {
		  if(a[j]>a[i])
		  {
			  count++;
			  loopJ(a,i,j,count);
		  }
	  }
	  else
	  {
		  if(count==0)
			  System.out.print(a[i]+" ");
	  }
	}

}
